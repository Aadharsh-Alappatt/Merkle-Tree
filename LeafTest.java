package merkletree;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LeafTest
{
	private Leaf leaf;
	
	private List<byte[]> blocks1and2;
	
	private String leafString;
	
	
	@Before
	public void setUp() throws Exception 
	{
		try
		{
			
			final byte[] block1 = {(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
			final byte[] block2 = {(byte) 0xae, (byte) 0x45, (byte) 0x98, (byte) 0xff};
		

			blocks1and2 = new ArrayList<byte[]>();
			blocks1and2.add(block1);
			blocks1and2.add(block2);
		
			leaf = new Leaf(blocks1and2);
		
			leafString =  "[01,02,03,04][AE,45,98,FF]";
		}
		catch (Exception e)
		{
			
			assert false;
		}
	}

	
	@Test
	public final void testGetDataBlock() 
	{
		List<byte[]> dataBlock = leaf.getDataBlock();
		
		assertTrue("Incorrect data block returned",
				   dataBlock.equals(blocks1and2));
	}

	
	@Test
	public final void testToString() 
	{
		assertTrue("Leaf equals " + leaf.toString() +
				   " and not " + leafString, 
				   leaf.toString().equals(leafString));
	}

}
