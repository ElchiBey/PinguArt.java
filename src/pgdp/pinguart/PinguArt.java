package pgdp.pinguart;

import static pgdp.MiniJava.*;

public class PinguArt {

	public static void main(String[] args) {
        int n=0;
        int N1 = readInt("Please enter a Pingu Art number:");
        int N2 = readInt("Please enter a Pingu Art number:");
        int N3 = readInt("Please enter a Pingu Art number:");
        int N4 = readInt("Please enter a Pingu Art number:");
        int N5 = readInt("Please enter a Pingu Art number:");
        int N6 = readInt("Please enter a Pingu Art number:");
        int N7 = readInt("Please enter a Pingu Art number:");
        int N8 = readInt("Please enter a Pingu Art number:");
        write("+---[PinguArt]---+");
        writeConsole("|");
        while (n < 8) {
            int a = N1 % 10;
            if (a == 0) writeConsole(" ");
            else if (a == 1) writeConsole("-");
            else if (a == 2) writeConsole("~");
            else writeConsole("p");
            N1 = (N1 - N1 % 10) / 10;
            n++;
        }
        n=0;
        while (n < 8) {
            int a = N2 % 10;
            if (a == 0) writeConsole(" ");
            else if (a == 1) writeConsole("-");
            else if (a == 2) writeConsole("~");
            else writeConsole("p");
            N2 = (N2 - N2 % 10) / 10;
            n++;
        }
        writeConsole("|\n");
        writeConsole("|");
        n=0;
        while (n < 8) {
            int a = N3 % 10;
            if (a == 0) writeConsole(" ");
            else if (a == 1) writeConsole("-");
            else if (a == 2) writeConsole("~");
            else writeConsole("p");
            N3 = (N3 - N3 % 10) / 10;
            n++;
        }
        n=0;
        while (n < 8) {
            int a = N4 % 10;
            if (a == 0) writeConsole(" ");
            else if (a == 1) writeConsole("-");
            else if (a == 2) writeConsole("~");
            else writeConsole("p");
            N4 = (N4 - N4 % 10) / 10;
            n++;
        }
        writeConsole("|\n");
        writeConsole("|");
        n=0;
        while (n < 8) {
            int a = N5 % 10;
            if (a == 0) writeConsole(" ");
            else if (a == 1) writeConsole("-");
            else if (a == 2) writeConsole("~");
            else writeConsole("p");
            N5 = (N5 - N5 % 10) / 10;
            n++;
        }
        n=0;
        while (n < 8) {
            int a = N6 % 10;
            if (a == 0) writeConsole(" ");
            else if (a == 1) writeConsole("-");
            else if (a == 2) writeConsole("~");
            else writeConsole("P");
            N6 = (N6 - N6 % 10) / 10;
            n++;
        }
        writeConsole("|\n");
        writeConsole("|");
        n=0;
        while (n < 8) {
            int a = N7 % 10;
            if (a == 0) writeConsole(" ");
            else if (a == 1) writeConsole("-");
            else if (a == 2) writeConsole("~");
            else writeConsole("p");
            N7 = (N7 - N7 % 10) / 10;
            n++;
        }
        n=0;
        while (n < 8) {
            int a = N8 % 10;
            if (a == 0) writeConsole(" ");
            else if (a == 1) writeConsole("-");
            else if (a == 2) writeConsole("~");
            else writeConsole("p");
            N8 = (N8 - N8 % 10) / 10;
            n++;
        }
        writeConsole("|\n");
        write("+----------------+");
	}
}
