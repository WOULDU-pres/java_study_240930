package day8.thread;

class SMIFileThread extends Thread {
	@Override
	public void run() {
		String[] strArray = { "one", "two", "three", "four", "five" };
		try {
			Thread.sleep(19);
		} catch (InterruptedException e) {
		}

		for (int i = 0; i < strArray.length; i++) {
			System.out.println("- 자막 번호" + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Thread_1 {
	public static void main(String[] args) {
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();

		int[] intArray = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("비디오 프레임" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
