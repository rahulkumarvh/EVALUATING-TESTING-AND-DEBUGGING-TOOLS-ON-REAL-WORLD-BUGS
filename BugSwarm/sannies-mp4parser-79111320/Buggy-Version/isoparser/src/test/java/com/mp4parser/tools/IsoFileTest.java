package com.mp4parser.tools;

import com.mp4parser.IsoFile;
import junit.framework.TestCase;

/**
 *
 */
public class IsoFileTest extends TestCase {
  public void testFourCC() {
    assertEquals("AA\0\0", IsoFile.bytesToFourCC(new byte[]{65, 65}));
    assertEquals("AAAA", IsoFile.bytesToFourCC(new byte[]{65, 65, 65, 65, 65, 65}));
    assertEquals("AAAA", new String(IsoFile.fourCCtoBytes("AAAAAAA")));
    assertEquals("AA\0\0", new String(IsoFile.fourCCtoBytes("AA")));
    assertEquals("\0\0\0\0", new String(IsoFile.fourCCtoBytes(null)));
    assertEquals("\0\0\0\0", new String(IsoFile.fourCCtoBytes("")));
    assertEquals("\0\0\0\0", IsoFile.bytesToFourCC(null));
    assertEquals("\0\0\0\0", IsoFile.bytesToFourCC(new byte[0]));

  }
}
