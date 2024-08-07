// Object * 1 Per  ---  Variable Star  ---  OID=@109146   (@@2939,0)  ---  coobox=2273 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source 
Star "1 Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "1 Per"
	Class           "B1.5V"
	AbsMagn         -1.37
	MassSol         6.95
	RadSol          3.29
	LumBol          2188
	Teff            21500
	RotationPeriod  34.8

	BinaryOrbit     
	{
		PeriodDays      25.935951
		Eccentricity    0.3768
		Inclination     88.048
		Epoch           2443563.466
		ArgOfPericenter 299.83
		MeanAnomaly     0
	}
}

Star "1 Per B"
{
	DateUpdated     "2024-06-27"
	ParentBody      "1 Per"
	Class           ""
	AbsMagn         -1.77
	MassSol         7.42
	RadSol          3.86
	LumBol          3311
	Teff            22000
	RotationPeriod  33.6
}

// Object * 6 Per  ---  Spectroscopic Binary  ---  OID=@84835   (@@2270,3)  ---  coobox=2583 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Red Giant Branch star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,High Proper Motion Star,Star,Infra-Red Source 
Remove "6 Per A" {ParentBody "6 Per"}
Remove "6 Per B" {ParentBody "6 Per"}
Star "6 Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HIP 10366"
	Class           "G8.5IIIbFe-2"
	AbsMagn         1.25
	MassSol         1.5
	RadSol          7
	LumBol          26.3
	Teff            4920
	FeH             -0.60

	BinaryOrbit     
	{
		PeriodDays      1576.23
		SemiMajorAxisKm 207977830.40280943429703456379101 // Asini = 2.018E11 m
		Eccentricity    0.8828
		Inclination     104
		Epoch           2450307.31
		ArgOfPericenter 86.4
		MeanAnomaly     0
	}
}

Star "6 Per B"
{
	ParentBody      "HIP 10366"
	Class           "M9.5?"
}

// Object * 66 And  ---  Spectroscopic Binary  ---  OID=@110881   (@@1956,3)  ---  coobox=2632 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "66 And A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "66 And"
	Class           "F4V"
	AbsMagn         3.1
	MassSol         1.38
	RadSol          1.7
	LumBol          4.9
	Teff            6627
	FeH             -0.14
	Age             1.273

	BinaryOrbit     
	{
		PeriodDays      10.989861
		SemiMajorAxisKm 6887430
		Eccentricity    0.19236
		Epoch           2454007.675
		ArgOfPericenter 70.55
		MeanAnomaly     0
	}
}

Star "66 And B"
{
	DateUpdated     "2024-06-27"
	ParentBody      "66 And"
	Class           ""
	AbsMagn         3.4
	RadSol          1.5
	LumBol          3.8
	Teff            6580.01449111841 // 计算的值
}

// Object * tet Per  ---  High Proper Motion Star  ---  OID=@111414   (@@1690,0)  ---  coobox=2656 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "TET Per A" {ParentBody "TET Per"}
Remove "TET Per B" {ParentBody "TET Per"}
Star "TET Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HIP 12777"
	Class           "F8V"
	AbsMagn         3.88
	MassSol         1.138
	RadSol          1.319
	LumBol          2.235
	Teff            6328
	FeH             -0.03
	Age             4.0

	BinaryOrbit     
	{
		Period          2720
		Separation      250
		Eccentricity    0.13
		Inclination     75.44
		AscendingNode   128
		Epoch           2310195.802469852846116
		ArgOfPericenter 290.64
		MeanAnomaly     0
	}
}

Star "TET Per B/GJ 107 B/Gaia DR3 438829835272390784/TIC 302158899/2MASS J02441025+4913540/LSPM J0244+4913W/ADS 2081 B/BD+48 746B/CCDM J02441+4913B/CSI+48 746 3/GCRV 1538/IDS 02374+4848 B/LTT 10895/NLTT 8787/[RHG95] 489/WDS J02442+4914B/** STF 296B/PM J02441+4913W/WEB 2598/Gaia DR2 438829835272390784/Karmn J02441+492"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HIP 12777"
	Parallax        89.3739
	AppMagn         9.87
	Class           "M1.5V"
	AbsMagn         9.63 // 计算的值
	MassSol         0.521
	RadSol          0.498
	LumBol          0.041200485390901945 // 计算的值
	Teff            3685
	FeH             -0.03
	Age             2.4
}

Star "TET Per Bb(?)"
{
	DateUpdated     "2024-06-27"
	ParentBody      "TET Per B"
	Class           "L"

	Orbit     
	{
		SemiMajorAxis   69.1308481822253
	}
}

// Object * 20 Per  ---  Double or Multiple Star  ---  OID=@11682   (@@364,5)  ---  coobox=2723 
// Object types: Double or Multiple Star,Double or Multiple Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "20 Per AB"
{
	ParentBody      "20 Per"
	BinaryOrbit     
	{
		Period          11770
		Separation      985.159016001698 // 13.94 asec
	}
}

Star "20 Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "20 Per AB"
	Class           "F4IV"
	AbsMagn         1.1 // 计算的值
	MassSol         1.5

	BinaryOrbit     
	{
		PeriodDays      11553.9
		Separation      15.7170725931673 // 0.2224 asec
		Eccentricity    0.7560
		Inclination     120.48
		AscendingNode   26.62
		Epoch           2450255.5
		ArgOfPericenter 85.54
		MeanAnomaly     0
	}
}

Star "20 Per B"
{
	DateUpdated     "2024-06-27"
	ParentBody      "20 Per AB"
	Class           ""
	MassSol         1.5
}

// Object * 20 Per C  ---  High Proper Motion Star  ---  OID=@11683   (@@364,6)  ---  coobox=2723 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "20 Per C/Gaia DR3 143119137917418752/TIC 67711020/ADS 2200 C/AG+38 323/BD+37 655C/CCDM J02537+3820C/CSI+37 655 2/GEN# +1.00017904C/HD 17904C/PPM 67876/UBV 2794/WDS J02537+3820C/2MASS J02534162+3820073/** STF 318C/PMSC 02474+3756C/PPMX J025341.6+382007/Gaia DR2 143119137916820096"
{
	DateUpdated     "2024-06-27"
	ParentBody      "20 Per"
	Class           "G7"
	MassSol         0.87
	RadSol          0.8315 // Gaia DR3
	LumBol          0.522240025048488 // 计算的值
	Teff            5381
	FeH             -0.043
}

// Object * 30 Per  ---  Spectroscopic Binary  ---  OID=@87373   (@@705,13)  ---  coobox=2719 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "30 Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "30 Per"
	Class           "B8V"
	AbsMagn         -0.96
	MassSol         4.24
	Radius          5836114.09272877 // 计算的值
	LumBol          611
	Teff            9908

	BinaryOrbit     
	{
		PeriodDays      36.5
		Eccentricity    0.3
		Epoch           24407531.7
		ArgOfPericenter 132
		MeanAnomaly     0
	}
}

Star "30 Per B"
{
	ParentBody      "30 Per"
	Class           "A5.2?"
}