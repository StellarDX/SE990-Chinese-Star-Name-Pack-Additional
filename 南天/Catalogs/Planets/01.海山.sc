// Object * p Vel  ---  Spectroscopic Binary  ---  OID=@3142397   (@@63319,10)  ---  coobox=20751 
// Object types: Double or Multiple Star,Spectroscopic Binary,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=51986
Remove "p Vel A" {ParentBody "p Vel"}
Remove "p Vel Aa" {ParentBody "p Vel A"}
Remove "p Vel Ab" {ParentBody "p Vel A"}
Remove "p Vel B" {ParentBody "p Vel"}
Barycenter "HD 92139"
{
	ParentBody      "HIP 51986"
	BinaryOrbit // Tok2019, Circ.198
	{
		Period          16.68
		Separation      10.6323230887684 // 0.398 asec
		Eccentricity    0.770
		Inclination     123.5
		AscendingNode   36.0
		Epoch           2458787.286199927330017
		ArgOfPericenter 107.3
		MeanAnomaly     0
	}
}

Star "HD 92139 Aa"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HD 92139"
	Class           "F3IV"
	AbsMagn         2.15
	MassSol         2.13

	BinaryOrbit // SB9_623 1969MNRAS.142..523E
	{
		PeriodDays      10.2104
		Eccentricity    0.510
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2416461.176
		ArgOfPericenter 5.0
		MeanAnomaly     0
	}
}

Star "HD 92139 Ab"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HD 92139"
	Class           "F0V"
	AbsMagn         2.70
	MassSol         1.81
}

Star "HD 92140"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HIP 51986"
	Class           "A6V"
	AbsMagn         2.14
	MassSol         2.41
}

// Object * mu. Vel  ---  Double or Multiple Star  ---  OID=@3170169   (@@63747,0)  ---  coobox=20785 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "MU Vel A" {ParentBody "MU Vel"}
Remove "MU Vel B" {ParentBody "MU Vel"}
Star "MU Vel A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HIP 52727"
	Class           "G6III"
	AbsMagn         -0.06
	MassSol         3.30
	RadSol          13
	LumBol          107
	Teff            5047
	Age             0.360

	BinaryOrbit     
	{
		Period          138
		Separation      51.2572509151454 // 1.427 asec
		Eccentricity    0.84
		Inclination     57.0
		AscendingNode   59.1
		Epoch           2433684.189877708908170
		ArgOfPericenter 358.0
		MeanAnomaly     0
	}
}

Star "MU Vel B"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HIP 52727"
	Class           "G2V"
}