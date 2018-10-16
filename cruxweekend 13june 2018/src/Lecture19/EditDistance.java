package Lecture19;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
		public static int editDistance(String s1, String s2) {
			if (s1.length() == 0) {
				return s2.length();
			}

			if (s2.length() == 0) {
				return s1.length();
			}

			String ros1 = s1.substring(1);
			String ros2 = s2.substring(1);
			int ans = 0;
			if (s1.charAt(0) == s2.charAt(0)) {
				ans = editDistance(ros1, ros2);
			} else {
				int f1 = 1 + editDistance(ros1, ros2);
				int f2 = 1 + editDistance(ros1, s2);
				int f3 = 1 + editDistance(s1, ros2);
				ans = Math.min(f1, Math.min(f2, f3));
			}
			return ans;
		}

		public static int editDistanceI(String str1, String str2) {
			int[][] strg = new int[str1.length() + 1][str2.length() + 1];
			strg[str1.length()][str2.length()] = 0;
			for (int i = str1.length(); i >= 0; i--) {
				for (int j = str2.length(); j >= 0; j--) {
					if (i == str1.length()) {
						strg[i][j] = str2.length() - j;
						continue;
					}
					if (j == str2.length()) {
						strg[i][j] = str1.length() - i;
						continue;
					}
					if (str1.charAt(i) == str2.charAt(j)) {
						strg[i][j] = strg[i + 1][j + 1];
					} else {

						int f1 = 1 + strg[i + 1][j + 1];
						int f2 = 1 + strg[i + 1][j];
						int f3 = 1 + strg[i][j + 1];
						strg[i][j] = Math.min(f1, Math.min(f2, f3));
					}
				}
			}
			return strg[0][0];
		}

	}


