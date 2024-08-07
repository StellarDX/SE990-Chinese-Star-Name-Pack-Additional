// Object * 1 Hya  ---  Spectroscopic Binary  ---  OID=@1068661   (@@16805,0)  ---  coobox=7499 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=41211
Barycenter "1 Hya AB"
{
	ParentBody      "1 Hya"
	BinaryOrbit     
	{
		Period          585470
		Separation      9631.45787363911 // 356.05 asec
	}
}

// Object * 1 Hya C  ---  Low-mass Star  ---  OID=@1068874   (@@133925,1)  ---  coobox=7499 
// Object types: Low-mass Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "1 Hya C/GJ 306 C/Gaia DR3 3066712069318056832/TIC 168978974/LP 665-6/NLTT 19472/2MASS J08245245-0341017/** ALP 29C/WDS J08246-0345C/BD-03 2333C/HD 70958C/UCAC4 432-045784/Gaia DR2 3066712069318056832"
{
	ParentBody      "1 Hya"
}

// ----------------------------------------------------------------------------------------------------

Barycenter "1 Hya A"
{
	ParentBody      "1 Hya AB"
	BinaryOrbit     
	{
		Period          18859
		Separation      958.141493932711 // 35.42 asec
	}
}

// Object * 1 Hya B  ---  Low-mass Star  ---  OID=@7866778   (@@-1,255)  ---  coobox=7499 
// Object types: Low-mass Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "1 Hya B/GJ 306 B/Gaia DR3 3066710282611675520/TIC 168975753/UCAC3 173-103614/2MASS J08243379-0344342/** TOK 20B/WDS J08246-0345B/UCAC4 432-045745/BD-03 2333B/HD 70958B/Gaia DR2 3066710282611675520"
{
	DateUpdated     "2024-07-25"
	ParentBody      "1 Hya AB"
	Class           "M4.5"
	MassSol         0.14
}

// ----------------------------------------------------------------------------------------------------

Star "1 Hya Ca"
{
	DateUpdated     "2024-07-25"
	ParentBody      "1 Hya C"
	Parallax        36.6831
	AppMagn         17.16
	Class           "M5.5Ve"
	AbsMagn         14.98 // 计算的值
	MassSol         0.13

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.024874314
		Eccentricity    0
		Inclination     2.48635812
		AscendingNode   0
		ArgOfPericenter 9.75560356
		MeanAnomaly     137.657389
	}
}

Star "1 Hya Cb"
{
	ParentBody      "1 Hya C"
	Class           "M6?"
}

// ----------------------------------------------------------------------------------------------------

Barycenter "1 Hya A1"
{
	ParentBody      "1 Hya A"
	BinaryOrbit     
	{
		Period          4.825
		Separation      3.78761475526055 // 0.140 asec
	}
}

Star "1 Hya A2"
{
	DateUpdated     "2024-07-25"
	ParentBody      "1 Hya A"
	Class           ""
	MassSol         0.79
}

// ----------------------------------------------------------------------------------------------------

Star "1 Hya Aa1"
{
	DateUpdated     "2024-07-25"
	ParentBody      "1 Hya A1"
	Class           "F6V"
	AbsMagn         3.45 // 计算的值
	MassKg          2.37396218654086e+30 // log(g) = 4.088 cm/s^2
	RadSol          1.635 // Gaia DR3
	LumBol          3.62113449173321 // 计算的值
	Teff            6227
	FeH             -0.928

	BinaryOrbit // SB9_512 1922ApJ....55...30S
	{
		PeriodDays      1.562975
		Eccentricity    0.051
		Epoch           2422650.082
		ArgOfPericenter 123.92
		MeanAnomaly     0
	}
}

Star "1 Hya Aa2"
{
	DateUpdated     "2024-07-25"
	ParentBody      "1 Hya A1"
	Class           ""
	MassSol         0.22
}

// ----------------------------------------------------------------------------------------------------

// Object * 15 Hya A  ---  High Proper Motion Star  ---  OID=@13281263   (@@-1,255)  ---  coobox=7548 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=43496
Barycenter "15 Hya A/Gaia DR3 5757113251781183104/TYC 4876-1546-1/** BU 587A/CCDM J08516-0711A/WDS J08516-0711A/HD 75737A/BD-06 2743A"
{
	ParentBody      "15 Hya"
	BinaryOrbit     
	{
		Period          718.932
		Separation      165.515776221397 // 1.21 asec
	}
}

Star "15 Hya Aa"
{
	DateUpdated     "2024-07-25"
	ParentBody      "15 Hya A"
	Parallax        7.8991
	AppMagn         5.73
	Class           "A2/3V"
	AbsMagn         0.218 // 计算的值
	MassKg          6.60759300264006e+30 // log(g) = 3.847 cm/s^2
	RadSol          3.6 // Gaia DR3
	LumBol          156.744906155449 // 计算的值
	Teff            10764
	FeH             0.681

	BinaryOrbit // SB9_538 1985ApJS...59..229A
	{
		PeriodDays      2.8952
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2440000.648
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "15 Hya Ab"
{
	DateUpdated     "2024-07-25"
	ParentBody      "15 Hya A"
	Class           ""
	MassSol         1.86
}

// Object * 15 Hya B  ---  High Proper Motion Star  ---  OID=@7084942   (@@-1,255)  ---  coobox=7548 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "15 Hya B/Gaia DR3 5757113256075639424/TYC 4876-1546-2/** BU 587B/CCDM J08516-0711B/WDS J08516-0711B/HD 75737B/BD-06 2743B"
{
	DateUpdated     "2024-07-25"
	ParentBody      "15 Hya"
	Class           ""
	MassSol         1.80
}

// Object * 17 Hya A  ---  Spectroscopic Binary  ---  OID=@1139303   (@@15788,20)  ---  coobox=7551 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=43822
Barycenter "17 Hya A/WISE J085529.60-075816.8/Gaia DR3 5756766016559683200/TIC 13741670/SBC9 1893/ADS 7093 A/BD-07 2661A/CCDM J08555-0758A/CSI-07 2661 2/GC 12335/GCRV 5868/HD 76370/HERZ 1184/HR 3553/IDS 08506-0735 A/ROT 1405/SAO 136409/WDS J08555-0758A/** STF 1295A/TYC 5443-1951-1/Renson 21470/PMSC 08555-0758A/PMSC 08555-0758Aab/UCAC4 411-046483/2MASS J08552960-0758158/WEB 8428/Gaia DR2 5756766016559683200"
{
	ParentBody      "17 Hya"
	BinaryOrbit     
	{
		Period          3559
		Separation      361.061893291223 // 4.08 asec
	}
}

Star "17 Hya Aa"
{
	DateUpdated     "2024-07-25"
	ParentBody      "17 Hya A"
	Parallax        10.9145
	AppMagn         6.7
	Class           "kA4hF1mF2"
	AbsMagn         1.89 // 计算的值
	MassSol         1.84 // log(g) = 4.045 cm/s^2
	RadSol          1.969316 // Gaia DR3
	LumBol          13.0863285023117 // 计算的值
	Teff            7823
	FeH             -0.355

	BinaryOrbit     
	{
		PeriodDays      18.8302
		Eccentricity    0.493
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2449101.9
		ArgOfPericenter 12.5
		MeanAnomaly     0
	}
}

Star "17 Hya Ab"
{
	DateUpdated     "2024-07-25"
	ParentBody      "17 Hya A"
	Class           "M3V"
	MassSol         0.24
}

// Object * 17 Hya B  ---  Star  ---  OID=@1139302   (@@15788,19)  ---  coobox=7551 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "17 Hya B/WISE J085529.63-075812.6/Gaia DR3 5756766016559682944/TIC 13741671/ADS 7093 B/BD-07 2661B/CCDM J08555-0758B/CSI-07 2661 1/GC 12334/GCRV 5867/HD 76369/HERZ 13138/HR 3552/IDS 08506-0735 B/ROT 1404/SAO 136408/SKY# 17207/UBV M 14907/WDS J08555-0758B/** STF 1295B/Renson 21460/PMSC 08555-0758B/TYC 5443-1951-2/UCAC4 411-046484/2MASS J08552962-0758119/WEB 8427/Gaia DR2 5756766016559682944"
{
	DateUpdated     "2024-07-25"
	ParentBody      "17 Hya"
	Parallax        11.0332
	AppMagn         6.907
	Class           "kA1hF2mF3"
	AbsMagn         2.12 // 计算的值
	MassSol         1.94 // log(g) = 3.963 cm/s^2
	RadSol          1.852518 // Gaia DR3
	LumBol          11.1251081009207 // 计算的值
	Teff            7745
	FeH             -1.342
}

// Object * D Hya  ---  Star  ---  OID=@1117631   (@@14872,3)  ---  coobox=7665 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "12 Hya A" {ParentBody "12 Hya"}
Remove "12 Hya B" {ParentBody "12 Hya"}
Star "12 Hya Aa"
{
	DateUpdated     "2024-07-25"
	ParentBody      "12 Hya"
	Class           "G8IIIbCN-1"
	AbsMagn         0.26
	MassSol         2.32
	RadSol          11.51
	LumBol          77.468
	Teff            4968
	Age             0.910

	BinaryOrbit     
	{
		PeriodDays      1592
		Separation      0.736019359517998 // 0.0116 asec
		Eccentricity    0.40
		Inclination     58
		AscendingNode   91
		Epoch           2449194
		ArgOfPericenter 283
		MeanAnomaly     0
	}
}

Star "12 Hya Ab"
{
	ParentBody      "12 Hya"
	Class           "A9.4?"
}

// Object * 18 Pup  ---  High Proper Motion Star  ---  OID=@1051811   (@@15155,0)  ---  coobox=7583 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=40035
Remove "18 Pup A" {ParentBody "18 Pup"}
Remove "18 Pup B" {ParentBody "18 Pup"}
Star "18 Pup A"
{
	DateUpdated     "2024-07-25"
	ParentBody      "HIP 40035"
	Class           "F6.5V"
	AbsMagn         3.77 // 计算的值
	MassKg          2.11291337709243e+30 // log(g) = 4.185 cm/s^2
	RadSol          1.3795 // Gaia DR3
	LumBol          2.55965310025883 // 计算的值
	Teff            6216
	FeH             -0.173
}

// Object L 818-40  ---  Double or Multiple Star  ---  OID=@1051812   (@@15155,1)  ---  coobox=7583 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star 
Barycenter "L 818-40/AP J08103429-1348514/GJ 9255 B/GJ 297.2 B/18 Pup B/TIC 422124638/CCDM J08106-1348B/CSI-13 2420 2/IDS 08059-1330 B/LP 724-22/LTT 3069/NLTT 19072/[RHG95] 1287/2MASS J08103429-1348514/WDS J08107-1348B/** LDS 204B/L 818-80/** JOD 4/WDS J08107-1348Ba,Bb/UCAC4 381-046868/PM J08105-1348/Gaia DR2 5725122965270676864/Karmn J08105-138AB"
{
	ParentBody      "HIP 40035"
	BinaryOrbit     
	{
		Period          72222
		Separation      2187.44007265339 // 96.99 asec
	}
}

// Object L 818-40 A  ---  High Proper Motion Star  ---  OID=@19276433   (@@-1,255)  ---  coobox=7583 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "L 818-40 A/Gaia DR3 5725122960972658048/WDS J08107-1348Ba/** JOD 4A"
{
	DateUpdated     "2024-07-25"
	ParentBody      "L 818-40"
	Parallax        47.8089
	AppMagn         11.815
	Class           "M2.5V"
	AbsMagn         10.21 // 计算的值
	MassSol         0.48

	BinaryOrbit     
	{
		Period          105.690
		Separation      25.4851685264912 // 1.13 asec
	}
}

// Object L 818-40 B  ---  High Proper Motion Star  ---  OID=@19276434   (@@-1,255)  ---  coobox=7583 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "L 818-40 B/Gaia DR3 5725122965265271680/WDS J08107-1348Bb/** JOD 4B"
{
	DateUpdated     "2024-07-25"
	ParentBody      "L 818-40"
	Class           ""
	MassSol         0.31
}

// Object * 19 Pup  ---  Star  ---  OID=@1051792   (@@15153,18)  ---  coobox=7581 
// Object types: Red Giant Branch star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "19 Pup A"
{
	DateUpdated     "2024-07-25"
	ParentBody      "19 Pup"
	Class           "G8.5IIIb"
	AbsMagn         1.05
	MassSol         1.05
	RadSol          8.9
	LumBol          43.31
	Teff            4750
	FeH             0.06
	Age             0.955

	BinaryOrbit     
	{
		Separation      114.913006069483 // 2.1 asec
	}
}

Star "19 Pup B"
{
	ParentBody      "19 Pup"
	Class           "F2.3?"
}