// Object * 34 Per  ---  Star  ---  OID=@187000   (@@1091,1)  ---  coobox=2768 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "34 Per A"
{
	DateUpdated     "2024-06-28"
	ParentBody      "34 Per"
	Class           "B3V"
	AbsMagn         -1.62
	MassSol         6.9
	RadSol          3.1
	LumBol          671
	Teff            16421
	Age             0.0293

	BinaryOrbit     
	{
		Separation      104.925638312148
	}
}

// Object * 34 Per B  ---  Star  ---  OID=@6849277   (@@-1,255)  ---  coobox=2768 
// Object types: Double or Multiple Star,Star 
Star "34 Per B/TYC 3320-2810-2/CCDM J03294+4931B/** BU 1179B/ADS 2558 B/HD 21428B/WDS J03294+4931B"
{
	ParentBody      "34 Per"
	Class           "A3.4?"
}

// SIG Per b
Planet	"SIG Per b"
{
	ParentBody     "SIG Per"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	MassJup        6.5

	Orbit
	{
		Epoch           2453022.6
		PeriodDays      579.8
		SemiMajorAxis   1.8
		Eccentricity    0.3
		ArgOfPericen    83.5
	}
}

// Object * 3 Cam  ---  Spectroscopic Binary  ---  OID=@258127   (@@1161,0)  ---  coobox=2963 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=29317
Barycenter "3 Cam A"
{
	ParentBody      "3 Cam"
	BinaryOrbit     
	{
		Period          1313
		Separation      230.726682554104 // 1.796 asec
	}
}

Star "3 Cam Aa"
{
	DateUpdated     "2024-06-28"
	ParentBody      "3 Cam A"
	Class           "G9III"
	AbsMagn         -0.82
	MassSol         3.3
	RadSol          24.1
	LumBol          259
	Teff            4715
	FeH             -0.21
	RotationPeriod  2904

	BinaryOrbit // SB9_260 1918PDO.....4..175C (Conmined)
	{
		PeriodDays      121
		Eccentricity    0.02
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2421137.551
		ArgOfPericenter 105.0
		MeanAnomaly     0
	}
}

Star "3 Cam Ab"
{
	DateUpdated     "2024-06-28"
	ParentBody      "3 Cam A"
	Class           ""
	MassSol         2.37
}

Star "3 Cam B"
{
	DateUpdated     "2024-06-28"
	ParentBody      "3 Cam"
	Class           ""
	MassSol         0.65
}

// Object NAME * 2 Cam AB  ---  Double or Multiple Star  ---  OID=@258110   (@@1159,16)  ---  coobox=2961 
// Object types: Double or Multiple Star,Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=21730
Barycenter "2 Cam AB/WDS J04400+5328AB/ADS 3358 AB/CCDM J04400+5328AB/TYC 3732-1030-1/** BU 1295/** STF 566AB"
{
	ParentBody      "2 Cam"
	BinaryOrbit // Tok 2021
	{
		Period          660
		Separation      110.376263822479 // 1.666 asec
		Eccentricity    0.405
		Inclination     132.5
		AscendingNode   286.2
		Epoch           2455817.867123837582767
		ArgOfPericenter 285.1
		MeanAnomaly     0
	}
}

Star "2 Cam A"
{
	DateUpdated     "2024-06-28"
	ParentBody      "2 Cam AB"
	Class           "A8V"
	AbsMagn         1.25 // 计算的值
	MassSol         1.94

	BinaryOrbit // Tok 2021
	{
		Period          26.34
		Separation      11.4430131516029 // 0.1727 asec
		Eccentricity    0.846
		Inclination     113.3
		AscendingNode   12.6
		Epoch           2447519.564367533195764
		ArgOfPericenter 222.9
		MeanAnomaly     0
	}
}

Star "2 Cam B"
{
	DateUpdated     "2024-06-28"
	ParentBody      "2 Cam AB"
	Class           ""
	MassSol         1.45
}

// Object * 2 Cam C  ---  Star  ---  OID=@6367767   (@@-1,255)  ---  coobox=2961 
// Object types: Double or Multiple Star,Star 
Star "2 Cam C/WDS J04400+5328C/CCDM J04400+5328C/TYC 3732-1030-2/** STF 566C/PMSC 04320+5316C"
{
	DateUpdated     "2024-06-28"
	ParentBody      "2 Cam"
	Class           ""
	MassSol         1.49
}

// Object * 1 Cam A  ---  Star  ---  OID=@5615744   (@@-1,255)  ---  coobox=2961 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "1 Cam A/Gaia DR3 273895291446188288/TIC 9197715/ADS 3274 A/CCDM J04320+5354A/CSI+53 779 1/GEN# +1.00028446A/IDS 04241+5342 A/TYC 3732-1028-1/uvby98 100028446 A/WDS J04320+5355A/** STF 550A/UCAC4 720-034655/2MASS J04320185+5354389/WISE J043201.85+535438.9/HD 28446A/GOS G151.91+03.95 01/Gaia DR2 273895291446188288"
{
	DateUpdated     "2024-06-28"
	ParentBody      "1 Cam"
	Parallax        1.263
	AppMagn         5.77
	Class           "O9.7IIn"
	AbsMagn         -6.3 // 计算的值(+~2.58消光)
	//MassSol         // log(g) = 3.65 cm/s^2
	Radius          1724387.07942547 // 计算的值
	LumBol          4365
	Teff            29800

	BinaryOrbit     
	{
		Separation      8163.10350224731 // 10.31 asec
	}
}

// Object * 1 Cam B  ---  Star  ---  OID=@258089   (@@1157,9)  ---  coobox=2961 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "1 Cam B/Gaia DR3 273895291446188160/TIC 9197722/2MASS J04320092+5354453/ADS 3274 B/AG+53 401/ALS 7982/BD+53 779B/CCDM J04320+5354B/CSI+53 779 2/GC 5491/GCRV 2646/HD 28446B/IDS 04241+5342 B/LS V +53 23/PPM 29209/ROT 3545/SAO 24670/UBV M 10159/WDS J04320+5355B/** STF 550B/TYC 3732-1027-1/WEB 4068/Gaia DR2 273895291446188160"
{
	DateUpdated     "2024-06-28"
	ParentBody      "1 Cam"
	Parallax        1.1211
	AppMagn         6.803
	Class           "B1IV:"
	AbsMagn         -5.53
	Radius          1188637.2323812 // 计算的值
	LumBol          1995
	Teff            29512
	Age             0.020
}

// Object * b Per  ---  Spectroscopic Binary  ---  OID=@245596   (@@755,12)  ---  coobox=2956 
// Object types: Ellipsoidal Variable,High Proper Motion Star,Pulsating Variable,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "HD 26961 AB"
{
	ParentBody      "HD 26961"
	BinaryOrbit // VB6_HIP1997d b_Per Gr.9
	{
		Period          1.9214
		Separation      0.681421516863482 // 0.005 asec
		Eccentricity    0.235
		Inclination     83.5
		AscendingNode   115.3
		Epoch           2440143.498163151089102
		ArgOfPericenter 83.0
		MeanAnomaly     0
	}
}

Star "HD 26961 A"
{
	DateUpdated     "2024-06-28"
	ParentBody      "HD 26961 AB"
	Class           "A1III"
	AbsMagn         0.3
	MassSol         2.25
	RadSol          3.2
	LumBol          10
	Teff            9000

	BinaryOrbit     
	{
		PeriodDays      1.5274
		Eccentricity    0.020
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2440001.578
		ArgOfPericenter 291.0
		MeanAnomaly     0
	}
}

Star "HD 26961 B"
{
	DateUpdated     "2024-06-28"
	ParentBody      "HD 26961 AB"
	Class           ""
	MassSol         0.56
	RadSol          0.25
}

Star "HD 26961 C"
{
	DateUpdated     "2024-06-28"
	ParentBody      "HD 26961"
	Class           ""
	MassSol         1.24
	LumBol          2
}
