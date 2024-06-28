// Object * 43 Per  ---  Spectroscopic Binary  ---  OID=@213169   (@@1128,3)  ---  coobox=2773 
// Object types: Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=18453
Barycenter "43 Per A"
{
	ParentBody      "43 Per"
	BinaryOrbit     
	{
		Period          83465
		Separation      2873.32645118507 // 75.33 asec
	}
}

Star "43 Per Aa"
{
	DateUpdated     "2024-06-28"
	ParentBody      "43 Per A"
	Class           "F5V"
	AbsMagn         2.23
	MassSol         1.54
	RadSol          2.4
	LumBol          10.81
	Teff            6609
	FeH             0.00

	BinaryOrbit // SB9_204 1973PASP...85..115W
	{
		PeriodDays      30.438
		Separation      0.11
		Eccentricity    0.631
		Epoch           2440873.14
		ArgOfPericenter 207.07
		MeanAnomaly     0
	}
}

Star "43 Per Ab"
{
	DateUpdated     "2024-06-28"
	ParentBody      "43 Per A"
	Class           ""
	MassSol         1.38
}

// Object BD+50 861  ---  High Proper Motion Star  ---  OID=@213170   (@@1128,4)  ---  coobox=2773 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "BD+50 861/Gaia DR3 250437691903701760/TIC 429118360/2MASS J03564056+5042481/WDS J03566+5042B/UCAC2 48162236/LSPM J0356+5042/ASCC 242366/USNO-B1.0 1407-00107819/BDS 1933 B/CCDM J03566+5042B/CSI+50 860 2/GSC 03339-01311/IDS 03492+5024 B/ROT 3543/TYC 3339-1311-1/** S 440B/PMSC 03492+5024B/WISEA J035640.66+504246.7/Gaia DR1 250437687603927680/Gaia DR2 250437691903701760/Karmn J03566+507"
{
	DateUpdated     "2024-06-28"
	ParentBody      "43 Per"
	Class           "K5Ve"
	MassSol         0.71
}
