package _04_Data_Type_Option_Pane;

import javax.swing.JOptionPane;

public class DataTypeOptionPane {
    public static void main(String[] args) {
    	
        DataType[] dataTypes;
       dataTypes = DataType.values();
      
		int dataIndex = JOptionPane.showOptionDialog(null, "Pick a data type you want to learn more about", 
				"Data Types", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, dataTypes, 0);
		

        /*
         * Notice that the name of the enum's type is not required for the cases
         * in the switch statement.
         */
		switch (dataTypes[dataIndex]) {
        case INT: {
            JOptionPane.showMessageDialog(null, DataType.INT.bits);
            break;
        }
        case BYTE: {
        	JOptionPane.showMessageDialog(null, DataType.BYTE.bits);
            break;
        }
        case SHORT: {
        	JOptionPane.showMessageDialog(null, DataType.SHORT.bits);
            break;
        }
        case LONG: {
        	JOptionPane.showMessageDialog(null, DataType.LONG.bits);
            break;
        }
        case FLOAT: {
        	JOptionPane.showMessageDialog(null, DataType.FLOAT.bits);
            break;
        }
        case DOUBLE: {
        	JOptionPane.showMessageDialog(null, DataType.DOUBLE.bits);
            break;
        }
        case BOOLEAN: {
        	JOptionPane.showMessageDialog(null, DataType.BOOLEAN.bits);
            break;
        }
        case CHAR: {
        	JOptionPane.showMessageDialog(null, DataType.CHAR.bits);
            break;
        }
    }
    }}


