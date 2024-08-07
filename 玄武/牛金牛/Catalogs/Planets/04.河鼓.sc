// Object * chi Aql  ---  Double or Multiple Star  ---  OID=@2723611   (@@59768,0)  ---  coobox=20041 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,UV-emission Source 
Remove "CHI Aql A" {ParentBody "CHI Aql"}
Remove "CHI Aql B" {ParentBody "CHI Aql"}
Star "CHI Aql A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "HIP 96957"
	Class           "G2Ib-II"
	AbsMagn         -2.1
	Radius          15448869.6366114 // 计算的值
	LumBol          420
	Teff            5545

	BinaryOrbit     
	{
		Epoch           2453006
		Separation      109.42421661092
		PositionAngle   76.7
	}
}

Star "CHI Aql B"
{
	DateUpdated     "2024-06-02"
	ParentBody      "HIP 96957"
	Class           "B5V"
	AbsMagn         -1
}

// Object * pi. Aql A  ---  Star  ---  OID=@3554864   (@@77187,2)  ---  coobox=20043 
// Object types: Double or Multiple Star,Star 
Star "PI Aql A/Gaia DR3 4304528687797449984/HD 187259/** STF 2583A/CCDM J19487+1149A/BD+11 3994A/WDS J19487+1149A/TYC 1066-3553-2/uvby98 100187259/Gaia DR2 4304528687797449984"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PI Aql"
	Parallax        6.3883
	AppMagn         6.23
	Class           "G8III"
	AbsMagn         -0.22
	LumBol          108

	BinaryOrbit     
	{
		Separation      226.977132843976 // 1.45 asec
	}
}

// Object * pi. Aql B  ---  Star  ---  OID=@2723753   (@@60311,3)  ---  coobox=20043 
// Object types: Double or Multiple Star,Star 
Star "PI Aql B/ADS 12962 B/BD+11 3994B/CCDM J19487+1149B/CSI+11 3994 3/HD 187260/WDS J19487+1149B/** STF 2583B/TYC 1066-3553-1/Gaia DR2 4304528683497202688"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PI Aql"
	Class           "A1V"
}

// Object * omi Aql  ---  High Proper Motion Star  ---  OID=@2723794   (@@60314,0)  ---  coobox=20042 
// Object types: Rotating Variable,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "OMI Aql A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "OMI Aql"
	Class           "F8V"
	AbsMagn         3.71
	MassSol         1.252
	RadSol          1.52
	LumBol          2.8631890514882836 // 计算的值
	Teff            6090
	FeH             0.07
	Age             3.3

	BinaryOrbit     
	{
		Separation      431
	}
}

// Object * omi Aql B  ---  High Proper Motion Star  ---  OID=@2723796   (@@60314,2)  ---  coobox=20042 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Star,Optical Source 
Star "OMI Aql B/GJ 9671 B/GJ 768.1 B/Gaia DR3 4303294035005560704/TIC 408842762/ADS 13012 C/CCDM J19510+1025C/CSI+10 4073 3/WDS J19510+1025C/** J 124C/UCAC3 201-264597/UCAC4 503-122210/2MASS J19510068+1024400/SDSS J195100.74+102439.1/Gaia DR2 4303294035005560704/[RHG95] 3112/HIDDEN NAME GJ 768.1 C/HIDDEN NAME GJ 9671 C"
{
	DateUpdated     "2024-06-02"
	ParentBody      "OMI Aql"
	Class           "M3V"
	MassSol         0.33
}

// Object * phi Aql  ---  Spectroscopic Binary  ---  OID=@2724277   (@@60866,0)  ---  coobox=20065 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "PHI Aql A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PHI Aql"
	Class           "A1IV"
	AbsMagn         1.14
	MassSol         2.39
	RadSol          1.8 // 2.5
	LumBol          34
	Teff            9509
	FeH             0.47
	Age             0.280

	BinaryOrbit     
	{
		PeriodDays      3.32068
		// Separation      190.4 // ?
		Eccentricity    0.025
		Epoch           2423210.628
		ArgOfPericenter 223
		MeanAnomaly     0
	}
}

Star "PHI Aql B"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PHI Aql"
	Class           ""
	MassSol         0.4
}

// Object * ksi Aql b  ---  Extra-solar Planet  ---  OID=@4079755   (@@-1,255)  ---  coobox=20020
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "KSI Aql b/HD 188310b/Fortitudo"
{
	ParentBody     "Libertas"
	DiscMethod     "RadVel"
	DiscDate       "2008"
	MassJup        2.8

	Orbit
	{
		Epoch           2453001.7
		PeriodDays      136.75
		SemiMajorAxis   0.68
		Eccentricity    0
		ArgOfPericen    0
	}
}