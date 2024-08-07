// Object * 24 Sex b  ---  Extra-solar Planet  ---  OID=@5386019   (@@-1,255)  ---  coobox=14420
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "24 Sex b"
{
	ParentBody     "24 Sex"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	MassJup        1.99

	Orbit
	{
		Epoch           2454762
		PeriodDays      452.8
		SemiMajorAxis   1.333
		Eccentricity    0.09
		ArgOfPericen    9.2
	}
}

// Object * 24 Sex c  ---  Extra-solar Planet  ---  OID=@5386028   (@@-1,255)  ---  coobox=14420
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "24 Sex c"
{
	ParentBody     "24 Sex"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	MassJup        0.86

	Orbit
	{
		Epoch           2454930
		PeriodDays      883
		SemiMajorAxis   2.08
		Eccentricity    0.29
		ArgOfPericen    220.5
	}
}

// Object * 40 Sex A  ---  High Proper Motion Star  ---  OID=@7088539   (@@-1,255)  ---  coobox=14607 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "40 Sex A/Gaia DR3 3801325234130034432/TYC 4916-1314-1/CCDM J10493-0401A/** STF 1476A/WDS J10493-0401A/Gaia DR2 3801325234130034432"
{
	DateUpdated     "2024-07-29"
	ParentBody      "40 Sex"
	Parallax        8.5425
	AppMagn         7.07
	Class           "A2III"
	AbsMagn         1.73 // 计算的值
	MassKg          3.84398549183701e+30 // log(g) = 4.19 cm/s^2
	RadSol          1.85 // Gaia DR3
	LumBol          33.7046950242762 // 计算的值
	Teff            10225
	FeH             -0.591

	BinaryOrbit     
	{
		Separation      208.942475688134 // 2.43 asec
	}
}

// Object * 40 Sex B  ---  High Proper Motion Star  ---  OID=@7088540   (@@-1,255)  ---  coobox=14607 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "40 Sex B/Gaia DR3 3801325298554630912/TYC 4916-1314-2/CCDM J10493-0401B/** STF 1476B/WDS J10493-0401B/Gaia DR2 3801325298554630912"
{
	DateUpdated     "2024-07-29"
	ParentBody      "40 Sex"
	Parallax        8.9812
	AppMagn         7.77
	Class           ""
	AbsMagn         2.54 // 计算的值
	MassKg          2.60617271483027e+30 // log(g) = 3.907 cm/s^2
	RadSol          2.11 // Gaia DR3
	LumBol          7.9151509891828 // 计算的值
	Teff            6665
	FeH             -0.459
}
