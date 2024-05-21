// Object * 38 Vir b  ---  Extra-solar Planet  ---  OID=@11440358   (@@-1,255)  ---  coobox=15433
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "38 Vir b/HD 111998 b"
{
	ParentBody     "HD 111998"
	DiscMethod     "RadVel"
	DiscDate       "2016"
	MassJup        4.51

	Orbit
	{
		Epoch           2455490.2
		PeriodDays      825.9
		SemiMajorAxis   1.82
		Eccentricity    0.03
		ArgOfPericen    -87.3
	}
}

// Object * 46 Vir  ---  Double or Multiple Star  ---  OID=@2055393   (@@43360,17)  ---  coobox=15436 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "46 Vir A/TYC 4960-1335-1/** AGC 5A/CCDM J13006-0322A/WDS J13006-0322A"
{
	DateUpdated     "2024-05-20"
	ParentBody      "46 Vir"
	Class           "K1III"
	AbsMagn         3.57 // 计算的值

	BinaryOrbit     
	{
		Separation      83.9661370341082 // 0.81 asec
	}
}

// Object * 46 Vir B  ---  High Proper Motion Star  ---  OID=@11621528   (@@-1,255)  ---  coobox=15436 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "46 Vir B/** AGC 5B/CCDM J13006-0322B/WDS J13006-0322B/TYC 4960-1335-2"
{
	ParentBody      "46 Vir"
	Class           "G5.8?"
}

// Object * 48 Vir A  ---  Star  ---  OID=@15318957   (@@-1,255)  ---  coobox=15437 
// Object types: Double or Multiple Star,Star 
Star "48 Vir A/TYC 4960-1344-1/CCDM J13039-0340A/** BU 929A/ADS 8759 A/HD 113459A/WDS J13039-0340A"
{
	DateUpdated     "2024-05-20"
	ParentBody      "48 Vir"
	Class           "A9IV"
	AbsMagn         1.65 // 计算的值

	BinaryOrbit     
	{
		Separation      103.875999736857 // 0.67 asec
	}
}

// Object * 48 Vir B  ---  Star  ---  OID=@11621579   (@@-1,255)  ---  coobox=15437 
// Object types: Double or Multiple Star,Star 
Star "48 Vir B/TYC 4960-1344-2/CCDM J13039-0340B/** BU 929B/ADS 8759 B/HD 113459B/WDS J13039-0340B"
{
	ParentBody      "48 Vir"
	Class           "K1.6?"
}

// Object * psi Vir  ---  Long-Period Variable  ---  OID=@1999601   (@@41533,0)  ---  coobox=15465 
// Object types: Long-Period Variable,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
Star "PSI Vir A"
{
	DateUpdated     "2024-05-20"
	ParentBody      "PSI Vir"
	Class           "M3III"
	AbsMagn         -1.34
	MassSol         3.95
	RadSol          93
	LumBol          3548
	Teff            3500
	FeH             -0.10

	BinaryOrbit     
	{
		Separation      7.94667216988696 // 0.04 asec
	}
}

Star "PSI Vir B"
{
	ParentBody      "PSI Vir"
	Class           "A3.3?"
}

// Object * chi Vir b  ---  Extra-solar Planet  ---  OID=@5130912   (@@-1,255)  ---  coobox=15414
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "CHI Vir b/HD 110014 b"
{
	ParentBody     "HD 110014"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	MassJup        11.09

	Orbit
	{
		Epoch           2451796.9065
		PeriodDays      835.477
		SemiMajorAxis   2.14
		PericenterDist  1.15
		Eccentricity    0.462
		ArgOfPericen    290.6
	}
}

// Object * chi Vir c  ---  Extra-solar Planet Candidate  ---  OID=@9759130   (@@-1,255)  ---  coobox=15414
// Object types: Star,Extra-solar Planet Candidate
Planet "CHI Vir c/HD 110014 c"
{
	ParentBody     "HD 110014"
	DiscMethod     "RadVel"
	DiscDate       "2015"
	MassJup        3.1

	Orbit
	{
		PeriodDays      130.0
		SemiMajorAxis   0.64
		Eccentricity    0.44
	}
}