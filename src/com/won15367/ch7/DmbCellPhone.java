package com.won15367.ch7;

public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	public void turnOnDmb() {
		System.out.println("방송을 킵니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("방송을 끕니다.");
	}
	
	public void ChannelChange(int channel) {
		System.out.println("채널을 " + channel + "로 변경합니다.");
	}

}
