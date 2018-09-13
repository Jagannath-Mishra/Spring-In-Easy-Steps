package com.jagan.spring.springcore.reftype;

public class Students {

		private Scores scoresHasA;

		@Override
		public String toString() {
			return "Students [scoresHasA=" + scoresHasA + "]";
		}

		public Scores getScoresHasA() {
			return scoresHasA;
		}

		public void setScoresHasA(Scores scoresHasA) {
			this.scoresHasA = scoresHasA;
		}

	
}
