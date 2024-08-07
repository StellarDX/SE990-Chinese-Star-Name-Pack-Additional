// Object * 11 Tau  ---  Spectroscopic Binary  ---  OID=@660882   (@@21073,0)  ---  coobox=4253 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "11 Tau A"
{
	DateUpdated     "2024-06-28"
	ParentBody      "11 Tau"
	Class           "A2IV"
	AbsMagn         -0.0784 // 计算的值
	MassKg          5.45671114963599e+30 // log(g) = 3.572 cm/s^2
	RadSol          4.49 // Gaia DR3
	LumBol          150.193566389365 // 计算的值
	Teff            9536
	FeH             -0.336

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.7581782
		Eccentricity    0.61247928
		Inclination     2.40797554
		AscendingNode   0
		ArgOfPericenter 2.15319098
		MeanAnomaly     -54.4536386
	}
}

Star "11 Tau B"
{
	ParentBody      "11 Tau"
	Class           "A5.2?"
}

// Object * 7 Tau A  ---  Star  ---  OID=@660817   (@@21064,10)  ---  coobox=4254 
// Object types: Double or Multiple Star,Star 
Star "7 Tau A/ADS 2616 A/BD+23 473A/CSI+23 473 3/WDS J03344+2428A/TYC 1802-1524-1/Gaia DR2 68486380271398912"
{
	DateUpdated     "2024-06-28"
	ParentBody      "7 Tau"
	Parallax        9.6776
	AppMagn         6.58
	Class           "A3IVs"
	AbsMagn         0.5
	MassSol         2.5
	RadSol          9.0
	LumBol          52
	Teff            8551

	BinaryOrbit     
	{
		Period          522.16
		Separation      82.2367839099674 // 0.625 asec
		Eccentricity    0.679
	}
}

// Object * 7 Tau B  ---  Star  ---  OID=@11611781   (@@-1,255)  ---  coobox=4254 
// Object types: Double or Multiple Star,Star 
Star "7 Tau B/TYC 1802-1524-2/ADS 2616 B/BD+23 473B/CSI+23 473 4/WDS J03344+2428B/Gaia DR2 68486384567412992"
{
	DateUpdated     "2024-06-28"
	ParentBody      "7 Tau"
	Class           "A3V"
	AbsMagn         0.6
	MassSol         2.5
}

// Object * 16 Tau  ---  Variable Star  ---  OID=@661336   (@@21124,0)  ---  coobox=4255 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Star,Infra-Red Source,UV-emission Source 
Remove "Celaeno A" {ParentBody "16 Tau"}
Remove "Celaeno B" {ParentBody "16 Tau"}
// JackDole (Gerhard H. Quast) 2020.05.25 07:09:39
// http://simbad.u-strasbg.fr/simbad/sim-id?Ident=16+Tau
// https://en.wikipedia.org/wiki/Celaeno_(star)
// SemiMajorAxis 0.824095488741804 = 0.0062 ArcSec
Star "16 Tau A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "16 Tau"
	Class           "B7IV"
	AbsMagn         -0.76
	MassSol         4.0
	RadSol          4.4
	LumBol          344
	Teff            12800
	RotationPeriod  19 // Vsini = 185 Km/s

	BinaryOrbit // 未修改
	{
        RefPlane        "ExtraSolar"
        SemiMajorAxis   0.346358974
        Period          0.284801164
        Eccentricity    0
        Inclination     45
        AscendingNode   0
        ArgOfPericenter 0
        MeanAnomaly     0
	}
}

Star "16 Tau B"
{
	DateUpdated     "2024-06-29"
	ParentBody      "16 Tau"
	Class           "A3"
	AbsMagn         1.629
    MassSol         2.9
    LumBol          57
}

// Object * 28 Tau  ---  Be Star  ---  OID=@676291   (@@20750,0)  ---  coobox=4320 
// Object types: Be Star,Chemically Peculiar Star,Emission-line Star,Double or Multiple Star,Emission-line Star,Irregular Variable,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,Optical Source,UV-emission Source,X-ray Source 
Star "28 Tau A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "28 Tau"
	Class           "B8Vne"
	AbsMagn         -0.347
	MassSol         2.888
	RadSol          3.701
	LumBol          184
	Teff            11058
	FeH             0.02
	Age             0.125
	RotationPeriod  11.8 // Vsini = 290 - 329 Km/s

	BinaryOrbit     
	{
		PeriodDays      218
		Separation      24
		Eccentricity    0.6
	}
}

Star "28 Tau B"
{
	DateUpdated     "2024-06-29"
	ParentBody      "28 Tau"
	Class           ""
	MassSol         0.33 // ?
}