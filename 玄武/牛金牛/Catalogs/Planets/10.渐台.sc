// Object * del01 Lyr  ---  Spectroscopic Binary  ---  OID=@2900444   (@@57470,9)  ---  coobox=19910 
// Object types: Spectroscopic Binary,Pulsating Variable,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Remove "DEL1 Lyr A" {ParentBody "DEL1 Lyr"}
Remove "DEL1 Lyr B" {ParentBody "DEL1 Lyr"}
Star "DEL1 Lyr A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "HIP 92728"
	Class           "B2.5V"
	AbsMagn         -1.55
	MassSol         6.6 // 7.75 - 7.9
	Dimensions      (7767197.47423726, 7051221.32906072, 7767197.47423726) // 3367445.86209619 (计算的值)
	Luminosity      838
	LumBol          3620
	Teff            20350
	FeH             -0.05
	Age             0.009 // 0.0211

	BinaryOrbit     
	{
		PeriodDays      88.352
		Separation      0.313
		Eccentricity    0.37
		Epoch           2428406.613
		ArgOfPericenter 11.3
		MeanAnomaly     0
	}
}

Star "DEL1 Lyr B"
{
	DateUpdated     "2024-06-07"
	ParentBody      "HIP 92728"
	Class           "K2III"
}

// Object * 17 Lyr  ---  Spectroscopic Binary  ---  OID=@2843619   (@@58066,3)  ---  coobox=19871 
// Object types: Spectroscopic Binary,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=93917
Remove "17 Lyr A" {ParentBody "17 Lyr"}
Remove "17 Lyr B" {ParentBody "17 Lyr"}
Barycenter "17 Lyr A"
{
	ParentBody      "HIP 93917"
	BinaryOrbit     
	{
		Period          1124
		Separation      159.260019456489 // 3.64 asec
	}
}

Star "17 Lyr Aa"
{
	DateUpdated     "2024-06-07"
	ParentBody      "17 Lyr A"
	Class           "F0V"
	AbsMagn         2.01 // 计算的值
	MassSol         1.6
	RadSol          2.5
	LumBol          16.4
	Teff            6887
	FeH             0.0
	Age             1.4

	BinaryOrbit // SB9_1123 1983MNRAS.203..917D
	{
		PeriodDays      42.8570
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2441195.328
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "17 Lyr Ab"
{
	DateUpdated     "2024-06-07"
	ParentBody      "17 Lyr A"
	Class           ""
	MassSol         0.23
}

// Object * 17 Lyr B  ---  High Proper Motion Star  ---  OID=@15319880   (@@-1,255)  ---  coobox=19871 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "17 Lyr B/Gaia DR3 2042936967130460032/** STF 2461B/ADS 12061 B/CCDM J19075+3231B/WDS J19074+3230B/Gaia DR2 2042936967130460032"
{
	DateUpdated     "2024-06-07"
	ParentBody      "HIP 93917"
	Class           ""
	MassSol         0.73
	Radius          487667.49993767 // log(g) = 4.61 cm/s^2
	LumBol          0.34042442892921554 // 计算的值
	Teff            5266
	FeH             -0.46
}

// Object * lam Lyr  ---  Variable Star  ---  OID=@2843622   (@@58066,6)  ---  coobox=19869 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
Star "LAM Lyr A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "LAM Lyr"
	Class           "K2.5III:Ba0.5"
	AbsMagn         -3.75
	MassSol         6.3
	RadSol          102.11
	LumBol          3073.1
	Teff            4253
	FeH             -0.02
	Age             0.0584

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   223.431623
		Eccentricity    0.819955794
		Inclination     -1.20560217
		AscendingNode   0
		ArgOfPericenter 91.8906463
		MeanAnomaly     -25.9376658
	}
}

Star "LAM Lyr B"
{
	ParentBody      "LAM Lyr"
	Class           "WD"
}

// Object * nu.01 Lyr  ---  Variable Star  ---  OID=@2842808   (@@57490,0)  ---  coobox=19861 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,UV-emission Source 
Star "NU1 Lyr A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "NU1 Lyr"
	Class           "B3IV"
	AbsMagn         -1.73
	MassSol         6.9
	Radius          4192579.24822832 // 计算的值
	LumBol          1460
	Teff            14534
	Age             0.0398

	BinaryOrbit     
	{
		Epoch           2454832
		Separation      12686.4838801385 // 34.1 asec
		PositionAngle   76
	}
}

// Object UCAC4 615-065287  ---  Star  ---  OID=@2842809   (@@57490,1)  ---  coobox=19861 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC4 615-065287/WISE J184948.51+324854.4/2MASS J18494852+3248547/Gaia DR3 2090564031276097152/ADS 11732 B/CCDM J18498+3249B/CSI+32 3227 2/GEN# +1.00174585B/WDS J18498+3249B"
{
	DateUpdated     "2024-06-07"
	ParentBody      "NU1 Lyr"
	Class           ""
	MassKg          1.72717673743249e+30 // log(g) = 4.383 cm/s^2
	RadSol          0.993 // Gaia DR3
	LumBol          0.885581027303941 // 计算的值
	Teff            5619
	FeH             -0.063
}
