// Object * psi01 Dra A  ---  Spectroscopic Binary  ---  OID=@327915   (@@7883,3)  ---  coobox=1547 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Barycenter "女史增一/PSI1 Dra A/GJ 9602 A/GJ 694.1 A/HIP 86614/Gaia DR3 1651268660203160448/TIC 441804568/PLX 4069/SPOCS 2955/LSPM J1741+7208/TYC 4436-1425-1/ASCC 47489/USNO-B1.0 1621-00130741/* 31 Dra A/ADS 10759 A/AG+72 474/BD+72 804/CCDM J17420+7209A/CSI+72 804 1/FK5 670/GC 24089/GCRV 10263/GEN# +1.00162003/HD 162003/HIC 86614/HR 6636/JP11 2897/LTT 15260/N30 3948/NLTT 45387/PMC 90-93 476/PPM 9604/ROT 2495/SAO 8890/SKY# 31977/UBV 15162/UBV M 22421/uvby98 100162003/2MASS J17415635+7208561/WDS J17419+7209A/** STF 2241A/Dziban/WEB 14603/Gaia DR2 1651268660202647296"
{
	DateUpdated     "2024-04-28"
	ParentBody      "PSI1 Dra"
	BinaryOrbit
	{
		Period          10000
		Separation      691.695105133619 // 30.40 asec
	}
}

Star "PSI1 Dra Aa"
{
	DateUpdated     "2024-04-28"
	ParentBody      "PSI1 Dra A"
	Parallax        43.95
	AppMagn         4.55
	Class           "F5IV-V"
	AbsMagn         2.76 // 计算的值
	MassSol         1.38
	RadSol          1.2 // 1.3
	LumBol          2.379191135241565 // 计算的值
	Teff            6544
	FeH             -0.10

	BinaryOrbit
	{
		PeriodDays      6774
		Separation      9.1
		Eccentricity    0.679
		Inclination     31
		Epoch           2450388
		ArgOfPericenter 212.6
		MeanAnomaly     0
	}
}

Star "PSI1 Dra Ab"
{
	ParentBody      "PSI1 Dra A"
	Class           ""
	MassSol         0.70
	Teff            4400
}

// Object * psi01 Dra B  ---  High Proper Motion Star  ---  OID=@327918   (@@7883,6)  ---  coobox=1547 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "PSI1 Dra B"
{
	DateUpdated     "2024-04-28"
	ParentBody      "PSI1 Dra"
	Parallax        44.0496
	AppMagn         5.53
	Class           "F8V"
	AbsMagn         3.75 // 计算的值
	MassSol         1.19
	RadSol          1.5
	LumBol          3.0185750954609474 // 计算的值
	Teff            6212
	Age             3.3
}

// Object * psi01 Dra Bb  ---  Extra-solar Planet  ---  OID=@9918887   (@@-1,255)  ---  coobox=1547 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet "PSI1 Dra Bb"
{
	ParentBody      "PSI1 Dra B"
	DiscMethod      "RadVel"
	DiscDate        "2006"
	MassKg          2.90413125e+27

	Orbit
	{
		SemiMajorAxis   4.43
		PeriodDays      3117
		Eccentricity    0.40
	}
}