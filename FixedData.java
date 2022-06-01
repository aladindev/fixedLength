
public class FixedData {
	
	/**
	 *  fixed된 고정값 저장소 
	 */
	public final int uniqueId = 12;        // uniqueId
    public final int name     = 15;        // name
    public final int phnNum   = 11;        // phnNum
 
 
    public byte[] firstByte 			= new byte[0];
    public byte[] uniqueIdByte 			= new byte[uniqueId];
    public byte[] nameByte				= new byte[name];
    public byte[] phnNumByte 			= new byte[phnNum];
 
    public int[] arrayId = { 0, uniqueId, name, phnNum};
    public byte[][] arrayByte = { firstByte, uniqueIdByte, phnNumByte};
    public String[] arrayKey = { "", "uniqueId", "name", "phnNum" };

}
