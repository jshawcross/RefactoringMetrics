package main.java.memoranda;

import nu.xom.Element;

class Day {
		Element dEl = null;

		public Day(Element el) {
			dEl = el;
		}

		public int getValue() {
			return new Integer(dEl.getAttribute("day").getValue()).intValue();
		}

		/*
		 * public Note getNote() { return new NoteImpl(dEl);
		 */

		public Element getElement() {
			return dEl;
		}
	}
/*
	static class EventsVectorSorter {

		private static Vector keys = null;

		private static int toMinutes(Object obj) {
			Event ev = (Event) obj;
			return ev.getHour() * 60 + ev.getMinute();
		}

		private static void doSort(int L, int R) { // Hoar's QuickSort
			int i = L;
			int j = R;
			int x = toMinutes(keys.get((L + R) / 2));
			Object w = null;
			do {
				while (toMinutes(keys.get(i)) < x) {
					i++;
				}
				while (x < toMinutes(keys.get(j))) {
					j--;
				}
				if (i <= j) {
					w = keys.get(i);
					keys.set(i, keys.get(j));
					keys.set(j, w);
					i++;
					j--;
				}
			}
			while (i <= j);
			if (L < j) {
				doSort(L, j);
			}
			if (i < R) {
				doSort(i, R);
			}
		}

		public static void sort(Vector theKeys) {
			if (theKeys == null)
				return;
			if (theKeys.size() <= 0)
				return;
			keys = theKeys;
			doSort(0, keys.size() - 1);
		}

	}
*/