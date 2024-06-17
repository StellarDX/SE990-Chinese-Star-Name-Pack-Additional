// Object * ups Cep  ---  Spectroscopic Binary  ---  OID=@197232   (@@9118,1)  ---  coobox=247 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "HR 7955 A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HR 7955"
	Class           "F8IV-V"
	AbsMagn         2.35
	MassSol         1.071

	BinaryOrbit     
	{
		PeriodDays      494.16
		Separation      1.84529819091474 // 0.065 asec
		Eccentricity    0.551
		Inclination     24.53
		AscendingNode   325.21
		Epoch           2450205.920739567838609
		ArgOfPericenter 248.86
		MeanAnomaly     0
	}
}

Star "HR 7955 B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HR 7955"
	Class           "F9IV-V"
	MassSol         1.047
}

// Object * 10 And  ---  Star  ---  OID=@1587271   (@@33265,0)  ---  coobox=10196 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "10 And A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "10 And"
	Class           "M0III"
	AbsMagn         -0.03 // 计算的值
	RadSol          33
	LumBol          258.78
	Teff            4029.974402664 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.962666525
		Eccentricity    0
		Inclination     -2.28684807
		AscendingNode   0
		ArgOfPericenter 156.623755
		MeanAnomaly     -173.551955
	}
}

Star "10 And B"
{
	ParentBody      "10 And"
	Class           "F1.8?"
}

// Object * 9 And  ---  Spectroscopic Binary  ---  OID=@1587198   (@@32543,8)  ---  coobox=10196 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Eclipsing Binary,Spectroscopic Binary,Variable Star,Star,UV-emission Source 
Star "9 And A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "9 And"
	Class           "A7m"
	AbsMagn         0.43
	MassSol         2.48
	RadSol          3.51
	LumBol          49.2
	Teff            8200

	BinaryOrbit     
	{
		PeriodDays      3.2196
		Eccentricity    0.03
		Inclination     60.2
		Epoch           2436094.876
	}
}

Star "9 And B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "9 And"
	Class           ""
	MassSol         1.32
	Radius          2419840.65293706 // 计算的值
	LumBol          17.5
	Teff            6330
}

// Object * 14 And b  ---  Extra-solar Planet  ---  OID=@4500593   (@@-1,255)  ---  coobox=10200
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "14 And b/HD 221345b/Spe"
{
	ParentBody     "Veritate"
	DiscMethod     "RadVel"
	DiscDate       "2008"
	MassJup        5.33

	Orbit
	{
		Epoch           2452861.4
		PeriodDays      185.84
		SemiMajorAxis   0.83
		Eccentricity    0
	}
}

// Object V* V1022 Cas  ---  Spectroscopic Binary  ---  OID=@80178   (@@5414,1)  ---  coobox=703 
// Object types: Spectroscopic Binary,Eclipsing Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 224355 A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 224355"
	Class           "F6V"
	AbsMagn         1.54 // 计算的值
	MassSol         1.626
	RadSol          2.570
	LumBol          9.67
	Teff            6350
	Age             1.9

	BinaryOrbit     
	{
		PeriodDays      12.1561594
		SemiMajorAxisKm 22890617.1 // 32.903 RSun
		Eccentricity    0.3115
		Inclination     82.925
	}
}

Star "HD 224355 B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 224355"
	Class           ""
	MassSol         1.607
	RadSol          2.445
	LumBol          9.15
	Teff            6420
	Age             1.9
}