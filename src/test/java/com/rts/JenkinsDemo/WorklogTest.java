package com.rts.JenkinsDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WorklogTest {

	Worklog work=new Worklog();
	
	@Test
	public void testAddLog1() {
		assertEquals("Added Log For kavi", work.addToLog("kavi"));
		
	}
	@Test
	public void testAddLog2() {
		assertEquals("Added Log For sri", work.addToLog("sri"));

	}
	
	@Test
	public void testAddLogins1() {
		assertEquals("Added Login Log for yoga", work.addLogins("yoga"));

	}
	
	@Test
	public void testAddLogins2() {
		assertEquals("Added Login Log for selvi", work.addLogins("selvi"));

	}

}
