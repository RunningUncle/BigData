package com.ljy.day10;

/**
 * ƿ���࣬��дequals�������Ƚ�����ƿ���Ƿ���ȣ�ֻҪ���ʣ���״�ʹ�С��ͬ������Ϊ��ȣ�
 * @author Administrator
 *
 */
public class Bottle {
	private String material;
	private String shape;
	private double size;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Bottle [material=" + material + ", shape=" + shape + ", size=" + size + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bottle) {
			Bottle b = (Bottle) obj;
			return b.getMaterial().equals(this.material) && b.shape.equals(this.shape) && b.size == this.size;
		}
		return super.equals(obj);
	}

}
