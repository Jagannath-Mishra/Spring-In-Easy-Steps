package com.jagan.spring.springcore.reftype;

public class Scores {
	private Double math, physis, chemistry;

	public Double getMath() {
		return math;
	}

	public void setMath(Double math) {
		this.math = math;
	}

	public Double getPhysis() {
		return physis;
	}

	public void setPhysis(Double physis) {
		this.physis = physis;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "Scores [math=" + math + ", physis=" + physis + ", chemistry=" + chemistry + "]";
	}
	
	
}
