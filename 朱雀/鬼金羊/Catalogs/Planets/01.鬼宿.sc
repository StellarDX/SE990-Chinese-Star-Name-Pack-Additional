// Object * 35 Cnc  ---  Star  ---  OID=@1090877   (@@20579,0)  ---  coobox=5613 
// Object types: Near-IR Source (λ < 3 µm),Star,Star,UV-emission Source 
Star "35 Cnc A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "35 Cnc"
	Class           "G0III"
	AbsMagn         0.22
	MassSol         1.072
	RadSol          0.981
	LumBol          77.23
	Teff            5950
	RotationPeriod  12.024
	Oblateness      0.04761904761904761904761904761905
}

// Object * d01 Cnc  ---  High Proper Motion Star  ---  OID=@1065067   (@@20164,18)  ---  coobox=5953 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "20 Cnc A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "20 Cnc"
	Class           "A9V"
	AbsMagn         0.63
	MassSol         2.41
	RadSol          3.7
	LumBol          59.9
	Teff            7907
	FeH             -0.30
	Age             0.700

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.556999058
		Eccentricity    0.00657813709
		Inclination     -0.827622175
		AscendingNode   0
		ArgOfPericenter -135.627322
		MeanAnomaly     150.203367
	}
}

Star "20 Cnc B"
{
	ParentBody      "20 Cnc"
	Class           "F3.2?"
}

// Object * d02 Cnc  ---  High Proper Motion Star  ---  OID=@1065102   (@@20168,12)  ---  coobox=5955 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "25 Cnc A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "25 Cnc"
	Class           "F6V"
	AbsMagn         2.85
	MassSol         1.51
	RadSol          2.0
	LumBol          6.60
	Teff            6487
	FeH             -0.10
	Age             2.50

	BinaryOrbit
	{
		Epoch           2456293
		Separation      764.229800710766 // 16.798 asec
		Period          4.5E6
		PositionAngle   310
	}
}

Star "25 Cnc B"
{
	DateUpdated     "2024-07-22"
	ParentBody      "25 Cnc"
	Class           ""
	MassSol         0.34
}

// Object * 45 Cnc  ---  Double or Multiple Star  ---  OID=@1112425   (@@19359,0)  ---  coobox=6001 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "45 Cnc A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "45 Cnc"
	Class           "G8III"
	AbsMagn         -1.62
	MassSol         3.11
	RadSol          13.86
	LumBol          210.3
	Teff            5058
	FeH             -0.69

	BinaryOrbit     
	{
		PeriodDays      1009.36
		Eccentricity    0.461
	}
}

Star "45 Cnc B"
{
	DateUpdated     "2024-07-22"
	ParentBody      "45 Cnc"
	Class           "A3III"
	MassSol         3.00
	LumBol          190.5
}

// Object * 54 Cnc  ---  High Proper Motion Star  ---  OID=@1127283   (@@20181,8)  ---  coobox=5974 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "54 Cnc A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "54 Cnc"
	Class           "G5V-IV"
	AbsMagn         3.39
	MassSol         1.23
	RadSol          1.81
	LumBol          3.72
	Teff            5862
	Age             5.0

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0222978541
		Eccentricity    0
		Inclination     1.6433841
		AscendingNode   0
		ArgOfPericenter -72.8595419
		MeanAnomaly     87.0305716
	}
}

Star "54 Cnc B"
{
	DateUpdated     "2024-07-22"
	ParentBody      "54 Cnc"
	Class           "G7.8?"
}

// Object * 83 Cnc  ---  High Proper Motion Star  ---  OID=@1616564   (@@33812,14)  ---  coobox=12463 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,UV-emission Source 
Star "83 Cnc A"
{
	DateUpdated     "2024-07-23"
	ParentBody      "83 Cnc"
	Class           "F4V"
	AbsMagn         3.57
	MassSol         1.13
	RadSol          1.53
	LumBol          3.135
	Teff            6218
	FeH             -0.26
	Age             3.1

	BinaryOrbit
	{
		PeriodDays      32
		Eccentricity    0.6
		Inclination     94
		AscendingNode   148
		Epoch           2442778.720627355854958
		ArgOfPericenter 351
		MeanAnomaly     0
	}
}

Star "83 Cnc B"
{
	DateUpdated     "2024-07-23"
	ParentBody      "83 Cnc"
	Class           "WD"
	MassSol         1.3
}

// Object * pi.01 Cnc  ---  Spectroscopic Binary  ---  OID=@1616825   (@@33554,15)  ---  coobox=12806 
// Object types: Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=45170
Remove "81 Cnc (AB)"{ParentBody "81 Cnc"}
Remove "81 Cnc (CD)"{ParentBody "81 Cnc"}
Remove "81 Cnc A"{ParentBody "81 Cnc (AB)"}
Remove "81 Cnc B"{ParentBody "81 Cnc (AB)"}
Remove "81 Cnc C"{ParentBody "81 Cnc (CD)"}
Remove "81 Cnc D"{ParentBody "81 Cnc (CD)"}
Barycenter "PI1 Cnc A"
{
	ParentBody      "PI1 Cnc"
	BinaryOrbit     
	{
		Separation      880
	}
}

Star "81 Cnc Aa"
{
	DateUpdated     "2024-07-23"
	ParentBody      "PI1 Cnc A"
	Class           "G8V"
	AbsMagn         4.95
	MassSol         0.89
	LumBol          1.03
	FeH             -0.14

	BinaryOrbit // 2018A&A...619A..81H (Combined)
	{
		PeriodDays      987.82
		Separation      2.2791996371036 // 0.112 asec
		Eccentricity    0.4431
		Inclination     123.8
		AscendingNode   318.7
		Epoch           2447197.82
		ArgOfPericenter 170.41
		MeanAnomaly     0
	}
}

Star "81 Cnc Ab"
{
	DateUpdated     "2024-07-23"
	ParentBody      "PI1 Cnc A"
	Class           "K1V"
	MassSol         0.85
}

// Object * pi.01 Cnc C  ---  Brown Dwarf  ---  OID=@1617044   (@@115459,11)  ---  coobox=12806 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Brown Dwarf,Star,Infra-Red Source 
Barycenter "PI1 Cnc C/GJ 337 D/GJ 337 C/TIC 35229529/2MASS J09121469+1459396/2MASSW J0912145+145940/WDS J09123+1500E/** BUG 16/WDS J09123+1500Ea,Eb"
{
	ParentBody      "PI1 Cnc"
}

// Object * pi.01 Cnc C  ---  Brown Dwarf  ---  OID=@1617044   (@@115459,11)  ---  coobox=12806 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Brown Dwarf,Star,Infra-Red Source 
Star "2MASSW J0912145+145940 Ea"
{
	DateUpdated     "2024-07-23"
	ParentBody      "PI1 Cnc C"
	Class           "L8.5"
	MassSol         0.04

	BinaryOrbit     
	{
		Period          150
		Separation      11
	}
}

Star "2MASSW J0912145+145940 Eb"
{
	DateUpdated     "2024-07-23"
	ParentBody      "PI1 Cnc C"
	Class           "L7.5"
	MassSol         0.05
}