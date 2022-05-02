
//implement Hill Cipher
class Hillcipher
{


static void matrix(String key, int matrix[][])
{
	int k = 0;
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			matrix[i][j] = (key.charAt(k)) % 65;
			k++;
		}
	}
}

static void enc(int cipherMatrix[][],
			int matrix[][],
			int msgVector[][])
{
	int x, i, j;
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 1; j++)
		{
			cipherMatrix[i][j] = 0;
		
			for (x = 0; x < 3; x++)
			{
				cipherMatrix[i][j] +=
					matrix[i][x] * msgVector[x][j];
			}
		
			cipherMatrix[i][j] = cipherMatrix[i][j] % 26;
		}
	}
}

static void HillCipher(String msg, String key)
{
	
	int [][]keyMatrix = new int[3][3];
	matrix(key, keyMatrix);

	int [][] msgVector = new int[3][1];

	// Generate vector for the message
	for (int i = 0; i < 3; i++)
		msgVector[i][0] = (msg.charAt(i)) % 65;

	int [][]cipherMatrix = new int[3][1];

	
	enc(cipherMatrix, keyMatrix, msgVector);

	String CipherText="";

	
	for (int i = 0; i < 3; i++)
		CipherText +=(cipherMatrix[i][0] + 65);

	// Finally print the ciphertext
	System.out.print(" Ciphertext:" + CipherText);
}

public static void main(String[] args)
{
	
	String message = "ABT";

	String key = "OYBMQKJRP";

	HillCipher(message, key);
	}
}

// SHUBHAM BHATT 190280116010
