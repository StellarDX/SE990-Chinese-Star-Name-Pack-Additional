// Object * 34 Psc  ---  Star  ---  OID=@1423028   (@@29604,2)  ---  coobox=11287 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "34 Psc A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "34 Psc"
	Class           "B9Vn"
	AbsMagn         0.749 // 计算的值
	MassKg          4.31252251515137e+30 // log(g) = 4.068 cm/s^2
	RadSol          2.255 // Gaia DR3
	LumBol          70.2009506180662 // 计算的值
	Teff            11126
	FeH             -0.798

	BinaryOrbit     
	{
		Separation      688.114898418153 // 7.61 asec
	}
}

// Object * 34 Psc B  ---  Star  ---  OID=@5170797   (@@-1,255)  ---  coobox=11287 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "34 Psc B/Gaia DR3 2753834044084699136/TIC 418760146/BD+10 8B/CCDM J00100+1109B/ADS 122 B/CSI+10 8 2/HD 560B/uvby98 100000560 B/2MASS J00100238+1108378/IDS 00049+1035 B/WDS J00100+1109B/GEN# +1.00000560B/Gaia DR2 2753834044084699136"
{
	DateUpdated     "2024-06-19"
	ParentBody      "34 Psc"
	Parallax        10.8148
	AppMagn         10.37
	Class           "G5Ve"
	AbsMagn         5.54 // 计算的值
	MassKg          1.75389765934076e+30 // log(g) = 4.324 cm/s^2
	RadSol          1.070984 // Gaia DR3
	LumBol          0.641224227733454 // 计算的值
	Teff            4991
	FeH             -0.795
}

// Object * 35 Psc  ---  Spectroscopic Binary  ---  OID=@1423315   (@@29614,4)  ---  coobox=11292 
// Object types: High Proper Motion Star,Spectroscopic Binary,Ellipsoidal Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=191
Remove "UU Psc (AB)" {ParentBody "UU Psc"}
Remove "UU Psc A" {ParentBody "UU Psc (AB)"}
Remove "UU Psc B" {ParentBody "UU Psc (AB)"}
Remove "UU Psc C" {ParentBody "UU Psc"}
Barycenter "35 Psc A"
{
	ParentBody      "35 Psc"
	BinaryOrbit     
	{
		Period          12985
		Separation      842.512651629321 // 11.45 asec
	}
}

Star "35 Psc Aa"
{
	DateUpdated     "2024-06-19"
	ParentBody      "35 Psc A"
	Class           "F0IV"
	AbsMagn         1.68 // 计算的值
	MassKg          2.55839620138821e+30 // log(g) = 3.676 cm/s^2
	RadSol          2.7275 // Gaia DR3
	LumBol          16.9358944175799 // 计算的值
	Teff            7090
	FeH             -1.121

	BinaryOrbit     
	{
		PeriodDays      0.841658
		Eccentricity    0.000
		Inclination     19
		AscendingNode   0.0
		Epoch           2436094.121
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "35 Psc Ab"
{
	DateUpdated     "2024-06-19"
	ParentBody      "35 Psc A"
	Class           "F0:"
	MassSol         1.15
}

// Object * 35 Psc B  ---  High Proper Motion Star  ---  OID=@1423314   (@@29614,3)  ---  coobox=11292 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "35 Psc B/HIP 1197/Gaia DR3 2752338227234710912/TIC 405190741/2MASS J00145927+0849057/ADS 191 B/AG+08 22/BD+08 19B/CCDM J00150+0849B/CSI+08 19 1/GC 288/GCRV 128/GEN# +1.00001061B/GSC 00595-01126/HD 1061B/HIC 1197/PPM 143294/SAO 109088/TYC 595-1126-1/UBV 157/uvby98 100001061 B/WDS J00150+0849B/** STF 12B/PMSC 00098+0815B/WEB 215/Gaia DR2 2752338227234710912"
{
	DateUpdated     "2024-06-19"
	ParentBody      "35 Psc"
	Parallax        13.4526
	AppMagn         7.54
	Class           "F"
	AbsMagn         1.68 // 计算的值
	MassKg          2.15843319242799e+30 // log(g) = 4.097 cm/s^2
	RadSol          1.542944 // Gaia DR3
	LumBol          4.0304477461839 // 计算的值
	Teff            6584
	FeH             -0.485
}

// Object * 36 Psc  ---  Double or Multiple Star  ---  OID=@1413845   (@@29333,3)  ---  coobox=11289 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "36 Psc A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "36 Psc"
	Class           "G8II-III"
	AbsMagn         0.451 // 计算的值
	MassKg          // log(g) = 2.811 cm/s^2
	Teff            5414
	FeH             -0.04

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.254012917
		Eccentricity    0
		Inclination     -1.59617853
		AscendingNode   0
		ArgOfPericenter -33.9484525
		MeanAnomaly     -79.1463264
	}
}

Star "36 Psc B"
{
	ParentBody      "36 Psc"
	Class           "K5.7?"
}

// Object * 51 Psc  ---  Double or Multiple Star  ---  OID=@1414239   (@@29343,9)  ---  coobox=11314 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=2548
Barycenter "51 psc A"
{
	ParentBody      "51 Psc"
	BinaryOrbit     
	{
		Period          61213
		Separation      2678.29887570635 // 27.20 asec
	}
}

Star "51 psc Aa"
{
	DateUpdated     "2024-06-19"
	ParentBody      "51 Psc A"
	Class           "B9.5V"
	AbsMagn         0.713 // 计算的值
	MassKg          4.15754517864271e+30 // log(g) = 3.966 cm/s^2
	RadSol          2.49 // Gaia DR3
	LumBol          83.6122560337515 // 计算的值
	Teff            11061
	FeH             -1.274

	BinaryOrbit // SOAR2021
	{
		Period          27.5
		Separation      15.657874369285 // 0.159 asec
		Eccentricity    0.810
		Inclination     110.8
		AscendingNode   105.8
		Epoch           2447526.869211508892477
		ArgOfPericenter 14.3
		MeanAnomaly     0
	}
}

Star "51 psc Ab"
{
	DateUpdated     "2024-06-19"
	ParentBody      "51 Psc A"
	Class           ""
	MassSol         1.84
}

// Object * 51 Psc B  ---  Star  ---  OID=@1414241   (@@29343,11)  ---  coobox=11314 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "51 Psc B/Gaia DR3 2747935576518646144/TIC 468360614/2MASS J00322560+0657230/ADS 449 B/AG+06 53/BD+06 65/CCDM J00324+0657B/GEN# +1.00002913B/HD 2913B/IDS 00272+0624 B/PPM 143600/SAO 109263/UBV 407/USNO-A2.0 0900-00126467/YZ 6 159/[ZEH2003] RX J0032.4+0657 2/WDS J00324+0657B/TYC 16-1424-1/** STF 36B/PMSC 00272+0624B/Gaia DR2 2747935576518646144"
{
	DateUpdated     "2024-06-19"
	ParentBody      "51 Psc"
	Parallax        11.4488
	AppMagn         9.55
	Class           "K2IV?"
	AbsMagn         4.84 // 计算的值
	MassKg          2.12978169526101e+30 // log(g) = 4.171 cm/s^2
	RadSol          1.4075 // Gaia DR3
	LumBol          1.46986372093329 // 计算的值
	Teff            5357
	FeH             -1
}

// Object * 44 Psc  ---  Double or Multiple Star  ---  OID=@1388770   (@@28725,1)  ---  coobox=11297 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "44 Psc A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "44 Psc"
	Class           "G8III"
	AbsMagn         -0.532 // 计算的值
	MassKg          5.95946382095799e+30 // log(g) = 2.623 cm/s^2
	RadSol          13.99215 // Gaia DR3
	LumBol          150.649171723756 // 计算的值
	Teff            5406
	FeH             0.044

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.07350157
		Eccentricity    0.772196209
		Inclination     1.76807034
		AscendingNode   0
		ArgOfPericenter -48.5219423
		MeanAnomaly     146.600229
	}
}

Star "44 Psc B"
{
	ParentBody      "44 Psc"
	Class           "A4.5?"
}

// Object * 10 Cet  ---  Double or Multiple Star  ---  OID=@1369461   (@@28322,27)  ---  coobox=10613 
// Object types: Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "10 Cet A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "10 Cet"
	Class           "G6IIIFe-1"
	AbsMagn         0.66 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   357.623375
		Eccentricity    0.286432278
		Inclination     1.72131294
		AscendingNode   0
		ArgOfPericenter 80.2679554
		MeanAnomaly     174.192178
	}
}

Star "10 Cet B"
{
	ParentBody      "10 Cet"
	Class           "A5.2?"
}