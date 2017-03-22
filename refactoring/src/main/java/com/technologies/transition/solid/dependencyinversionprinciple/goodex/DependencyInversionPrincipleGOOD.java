package com.technologies.transition.solid.dependencyinversionprinciple.goodex;

/**
 * Dependency Inversion Principle - Good example
 */
interface Worker {
	public void work();
}

class RegularWorker implements Worker{
	public void work() {
		// ....working
	}
}

class SuperWorker  implements Worker{
	public void work() {
		//.... working much more
	}
}

class Manager {
	Worker worker;

	public void setWorker(Worker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}