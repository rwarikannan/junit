package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Above {

	@Test
	public void IsSeniorcitizen() {
		Age age =new Age();
		int a=age.acceptage(61);
		Assert.assertTrue("The age follows the condition", a>60);

	}
	
	

}
