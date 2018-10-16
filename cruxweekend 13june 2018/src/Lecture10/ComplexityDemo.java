package Lecture10;

public class ComplexityDemo {

	public static long start;
	public static long end;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = { 3, 6, 1, 5, 8, 4 };
		// int[] sorted = mergeSort(arr, 0, arr.length - 1);
		// for (int i = 0; i < sorted.length; i++) {
		// System.out.print(sorted[i] + " ");
		// }

		// int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		// quicksort(arr, 0, arr.length - 1);
		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(arr[i] + " ");
		// }
		// int n = 1000000;
		// int[] arr = new int[n];
		//
		// for (int i = 0; i < n; i++) {
		// arr[i] = n - i;
		// }
		//
		// startAlgo();
		// int[] ans = mergeSort(arr, 0, arr.length - 1);
		// System.out.println("Merge sort took time " + endAlgo());
		//
		// for (int i = 0; i < n; i++) {
		// arr[i] = n - i;
		// }
		// startAlgo();
		// bubblesort(arr);
		// System.out.println("Bubble sort took time " + endAlgo());

		System.out.println(power(2, 5));
		int N = 500000;
		startAlgo();
		SOE(N);
		System.out.println("The seive took time " + endAlgo() + " milliseconds");

		startAlgo();
		printPrimes(N);
		System.out.println("The print prime took time " + endAlgo() + " milliseconds");

	}

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static int[] mergeSort(int[] arr, int low, int high) {

		if (low == high) {
			int[] base = new int[1];
			base[0] = arr[low];
			return base;
		}
		int mid = (low + high) / 2;
		int[] one = mergeSort(arr, low, mid);
		int[] two = mergeSort(arr, mid + 1, high);
		int[] sorted = merge(one, two);
		return sorted;
	}

	public static int[] merge(int[] one, int[] two) {

		int[] ans = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				ans[k] = one[i];
				i++;
				k++;
			} else {
				ans[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			ans[k] = one[i];
			i++;
			k++;
		}

		while (j < two.length) {
			ans[k] = two[j];
			j++;
			k++;
		}

		return ans;
	}

	public static void quicksort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int pindex = partition(arr, start, end);
		quicksort(arr, start, pindex - 1);
		quicksort(arr, pindex + 1, end);
	}

	public static int partition(int[] arr, int start, int end) {
		int pindex = start;
		int pivot = arr[end];
		for (int i = start; i <= end - 1; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pindex];
				arr[pindex] = temp;
				pindex++;
			}
		}
		int temp = arr[end];
		arr[end] = arr[pindex];
		arr[pindex] = temp;
		return pindex;
	}

	public static void bubblesort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = 1;
		if (n % 2 == 1) {
			int pnb2 = power(x, n / 2);
			ans = pnb2 * pnb2 * x;
		} else {
			int pnb2 = power(x, n / 2);
			ans = pnb2 * pnb2;
		}
		return ans;
	}

	public static void SOE(int n) {
		boolean[] primes = new boolean[n + 1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		int n2test = 2;
		while (n2test * n2test <= n) {
			if (primes[n2test]) {
				for (int multiplier = 2; multiplier * n2test <= n; multiplier++) {
					primes[n2test * multiplier] = false;
				}
			}
			n2test++;
		}

		for (int i = 2; i <= n; i++) {
			if (primes[i]) {
				// System.out.println(i);
			}
		}
	}

	public static void printPrimes(int N) {
		int start = 2;
		int end = N;

		boolean flag = true;
		while (start <= end) {
			int divisor = 2;
			flag = true;

			while (divisor < start) {
				if (start % divisor == 0) {
					flag = false;
					break;
				}
				divisor++;
			}

			if (flag == true) {
				// System.out.println(start);
			}
			start++;
		}

	}

	public static String getConcatenatedValues(int N) {
		String retVal = "";

		for (int i = 0; i <= N; i++) {
			retVal = retVal + i + "\n";
		}

		return retVal;
	}

	public static String getConcatenatedValuesBtr(int N) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= N; i++) {
			sb.append(i + "\n");
		}

		return sb.toString();
	}

	// For space complexity
	public static int getFactIterative(int n) {
		int rv = 1;

		while (n != 0) {
			rv *= n;
			n--;
		}

		return rv;
	}

	// For space complexity
	public static int getFactRecursive(int n) {
		if (n == 1) {
			return 1;
		}

		int factnm1 = getFactRecursive(n - 1);
		int factn = factnm1 * n;

		return factn;
	}
}
