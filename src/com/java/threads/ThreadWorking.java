package com.java.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWorking {
	
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * Why executer service? --> Just to make devloper's life easier. --> Creates,
		 * Manages and Executes thread for us more effieciently.
		 */

		/*
		 * Ways to create threads using executer service
		 */

		//singleThreadExe();
		//cachedThreadPool();
		//fixedThreadPool();
		//workStealingPool();
		//scheduledThreadPool();
		//singleScheduledThread();

	}

	private static void cachedThreadPool() {

		/*
		 * If there is an idle thread waiting on the queue, then the task producer hands
		 * off the task to that thread. Otherwise, since the queue is always full, the
		 * executor creates a new thread to handle that task.
		 */
		/*
		 * The cached pool starts with zero threads and can potentially grow to have
		 * Integer.MAX_VALUE threads. Practically, the only limitation for a cached
		 * thread pool is the available system resources.
		 */
		ExecutorService executor = Executors.newCachedThreadPool();
		/*
		 * Runnable thread = new TaskThread();
		 * 
		 * for(int i=1;i<=10;i++) executor.execute(thread);
		 */
		for (int i = 1; i <= 100; i++) {
			executor.execute(() -> {

				for (int j = 0; j < 10; j++) {
					System.out.println(Thread.currentThread().getName() + " - " + j++);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			});

		}

	}

	private static void singleScheduledThread() throws InterruptedException {
		ScheduledExecutorService shs = Executors.newSingleThreadScheduledExecutor();
 		System.out.println("Outside");
		 shs.scheduleWithFixedDelay(() -> {
			 	System.out.println("Strtd");
				for (int j = 0; j < 10; j++) {
					System.out.println(Thread.currentThread().getName() + " - " + j);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}, 5, 2,TimeUnit.SECONDS);
		 shs.awaitTermination(2, TimeUnit.SECONDS);
		 shs.shutdown();
		 System.out.println("Outside2");
	}

	private static void scheduledThreadPool() throws InterruptedException {

		/*
		 * You may want to execute a task after a period of time or to execute a task
		 * periodically. For these purposes, the Executor framework provides the
		 * ScheduledThreadPoolExecutor class.
		 * 
		 *  schedule
		 *  scheduleATFiexedRate
		 *  scheduleWithFixedDelay
		 *  This can be done for all types discussed before
		 */
		
		 ScheduledExecutorService shs = Executors.newScheduledThreadPool(10);
		// Runnable task1 = new TaskThread();
		
		 shs.scheduleAtFixedRate(() -> {
 			 	System.out.println("Strtd");
				for (int j = 0; j < 10; j++) {
					System.out.println(Thread.currentThread().getName() + " - " + j);

				}
			}, 5, 2,TimeUnit.SECONDS);
		 
		// shs.awaitTermination(10, TimeUnit.SECONDS);
		 shs.shutdown();

	}

	private static void workStealingPool() throws InterruptedException, ExecutionException {
		// fork join pool
		invokeAny();
		invokeAll();

		/*
		 * 
		 * 
		 */

	}

	private static void invokeAll() throws InterruptedException {

		// invokes all the tasks
		ExecutorService executor = Executors
				.newWorkStealingPool(2);/* can specify param - number of parallel threads allowed */

		List<Callable<String>> callables = Arrays.asList(
				callable("task1", 6), 
				callable("task2", 5),
				callable("task3", 6));

		List<Future<String>> result = executor.invokeAll(callables);
		result.stream().forEach(x -> {
			try {
				System.out.println(x.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

	private static void invokeAny() throws InterruptedException, ExecutionException {
		//picks and executes which ever is sooner
		ExecutorService executor = Executors.newWorkStealingPool(10);

		List<Callable<String>> callables = Arrays.asList(
				callable("task1", 2), 
				callable("task2", 2),
				callable("task3", 2));

		String result = executor.invokeAny(callables);
		System.out.println(result);
	}

	private static void fixedThreadPool() throws InterruptedException, ExecutionException {

		/*
		 * instead of an ever-increasing number of threads, the fixed thread pool tries
		 * to execute incoming tasks with a fixed amount of threads. When all threads
		 * are busy, then the executor will queue new tasks.
		 */
		useRunnable();
		useCallable();

	}

	private static void singleThreadExe() throws InterruptedException, ExecutionException {

		
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		/*
		 * Runnable thread = new TaskThread(); executor.execute(thread);
		 */
		
		
		
		 executor.execute(()->{ for(int i =0;i<10;i++)
		 System.out.println(Thread.currentThread().getName()+" - "+ i++ ); });
		 
		

	}

	private static void useRunnable() {

	 
		
 		ExecutorService executor = Executors.newFixedThreadPool(5);
		/*
		 * Runnable thread = new TaskThread();
		 * 
		 * for(int i=1;i<=10;i++) executor.execute(thread);
		 */
		for (int i = 1; i <= 10; i++) {
			executor.execute(() -> {

				for (int j = 0; j < 10; j++) {
					System.out.println(Thread.currentThread().getName() + " - " + j);

				}
				
			});
			
			System.out.println("Iteration -> "+i);
			
			

		}

		executor.shutdown(); //terminates when all the execution is completed.
		// executor.shutdownNow();//terminates at once

	}

	private static void useCallable() throws InterruptedException, ExecutionException {
		

		ExecutorService executor = Executors.newFixedThreadPool(10);
		
 		for (int i = 1; i <= 10; i++) {
			Future<String>  fut = executor.submit(callable("My result", 0));
			System.out.println(fut.get() + " -> " + Thread.currentThread().getName());
		}

		executor.shutdown(); // terminates when all the execution is completed.
		// executor.shutdownNow();//terminates at once
	}

	static Callable<String> callable(String result, long sleepSeconds) {
		return () -> {

			TimeUnit.SECONDS.sleep(sleepSeconds);
			System.out.println(result + " - > " + Thread.currentThread().getName());
			return result + Thread.currentThread().getName();
		};
	}
}
