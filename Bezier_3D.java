import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bezier_3D{

	public Bezier_3D() throws IOException {
	}

	File wczytaj = new File("C:\\Users\\Albert\\Desktop\\czajnik.txt");
	File zapisz = new File("C:\\Users\\Albert\\Desktop\\czajnik1.txt");
		
	Scanner scanner = new Scanner(wczytaj);
	BufferedWriter plik = new BufferedWriter(new FileWriter(zapisz));
	
	Punkt[][] Punkty = new Punkt[4][4];
			
	public void PunktyBeziera() throws IOException {
        double x,y,z;
        int ilosc = scanner.nextInt();

        plik.write("x, y, z"+System.lineSeparator());
        for(int i=0;i<ilosc;i++){
            for(int k=0;k<4;k++){
                for(int j=0;j<4;j++){
                    double tempx = Double.parseDouble(scanner.next());
                    double tempy = Double.parseDouble(scanner.next());
                    double tempz = Double.parseDouble(scanner.next());
                    Punkty[k][j] = new Punkt(tempx,tempy,tempz);
                }
            }

            for(double v=0.0;v<=1.0;v+=0.01) {
                for(double w=0.0;w<=1.0;w+=0.01){
                    x=0.0;
                    y=0.0;
                    z=0.0;
                    for (int k=0;k<4;k++){
                        for(int j=0; j<4 ;j++){
                            x += Punkty[k][j].x * Punkt.berstein(3,k,w) * Punkt.berstein(3,j,v);
                            y += Punkty[k][j].y * Punkt.berstein(3,k,w) * Punkt.berstein(3,j,v);
                            z += Punkty[k][j].z * Punkt.berstein(3,k,w) * Punkt.berstein(3,j,v);
                        }
                    }
                    plik.write(x+","+y+","+z+System.lineSeparator());
                }
            }
        }
	}
}
