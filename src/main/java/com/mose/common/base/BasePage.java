package com.mose.common.base;

import java.util.Objects;

public class BasePage {

	private int page = 1;
	private int size = 5;

	public BasePage(){}

	public BasePage(int page, int size){
		this.page = page;
		this.size = size;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BasePage basePage1 = (BasePage) o;
		return page == basePage1.page &&
				size == basePage1.size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(page, size);
	}

	@Override
	public String toString() {
		return "Page{" +
				"page=" + page +
				", size=" + size +
				'}';
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

