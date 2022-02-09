package _04_Data_Type_Option_Pane;

public enum DataType {
	INT(32), BYTE(8), SHORT(16), LONG(64), FLOAT(32), DOUBLE(64), BOOLEAN(1), CHAR(16);
	int bits;
	DataType(int bits){
		this.bits = bits;
	}
}
