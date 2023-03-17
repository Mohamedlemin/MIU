package FPP.Lesson8.Lab8.assigment4;

public class MyTable {
	private Entry[] entries = new Entry[26];

	public void add(char c, String s) {
		int index = c - 'a';
		entries[index] = new Entry(c, s);
	}

	public String get(char c) {
		int index = c - 'a';
		if (entries[index] != null) {
			return entries[index].getValue();
		} else {
			return null;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Entry e : entries) {
			if (e != null) {
				sb.append(e.toString()).append("\n");
			}
		}
		return sb.toString();
	}

	private class Entry {
		private char key;
		private String value;

		public Entry(char key, String value) {
			this.key = key;
			this.value = value;
		}

		public char getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		public String toString() {
			return key + "->" + value;
		}
	}
}
