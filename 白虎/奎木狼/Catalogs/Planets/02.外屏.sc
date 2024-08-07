// Object * 72 Psc  ---  Spectroscopic Binary  ---  OID=@1452994   (@@30271,5)  ---  coobox=11471 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=889
Barycenter "72 Psc A"
{
	ParentBody      "72 Psc"
	BinaryOrbit     
	{
		Period          352255
		Separation      8848.38925493709 // 167.6 asec
	}
}

Barycenter "72 Psc Aa"
{
	ParentBody      "72 Psc A"
	BinaryOrbit     
	{
		Period          0.701
		Separation      1.37696613667457 // 26 mas
	}
}

Star "72 Psc Aa1"
{
	DateUpdated     "2024-06-20"
	ParentBody      "72 Psc Aa"
	Class           "F4V((Sr))"
	AbsMagn         2.02 // 计算的值
	MassKg          3.39508711880939e+30 // log(g) = 3.773 cm/s^2
	RadSol          2.81 // Gaia DR3
	LumBol          12.6441002221733 // 计算的值
	Teff            6493
	FeH             -0.536

	BinaryOrbit // SB9_1654 2001Obs...121..162G
	{
		PeriodDays      50.3855
		Eccentricity    0.500
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450341.738
		ArgOfPericenter 317.6
		MeanAnomaly     0
	}
}

Star "72 Psc Aa2"
{
	DateUpdated     "2024-06-20"
	ParentBody      "72 Psc Aa"
	Class           ""
	MassSol         1.58
}

Star "72 Psc Ab"
{
	DateUpdated     "2024-06-20"
	ParentBody      "72 Psc A"
	Class           ""
	MassSol         1.41
}

Star "72 Psc C"
{
	DateUpdated     "2024-06-20"
	ParentBody      "72 Psc"
	Class           ""
	MassSol         0.29
}

// Object * 77 Psc A  ---  High Proper Motion Star  ---  OID=@1405531   (@@29079,0)  ---  coobox=11407 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=903
Star "77 Psc A/HIP 5141/Gaia DR3 2552059091858705024/TIC 344755784/ADS 903 A/AG+04 136/BD+04 175/CCDM J01058+0455A/CSI+04 175 1/GC 1317/GCRV 626/GEN# +1.00006479/GSC 00022-01278/HD 6479/HIC 5141/HR 313/IDS 01006+0423 A/PPM 144254/SAO 109666/SKY# 1671/TYC 22-1278-1/UBV 1088/UBV M 7920/YZ 4 286/uvby98 100006479/2MASS J01054924+0454300/[ZEH2003] RX J0105.8+0454 2/WDS J01058+0455A/WEB 1060/UCAC4 475-001566/Gaia DR2 2552059091858705024"
{
	DateUpdated     "2024-06-20"
	ParentBody      "77 Psc"
	Parallax        22.5346
	AppMagn         7.25 // Stellarium
	Class           "F5V"
	AbsMagn         4.01 // 计算的值
	MassSol         1.41
	RadSol          1.639 // Gaia DR3
	LumBol          4.69045846140901 // 计算的值
	Teff            6635
	FeH             -0.926
}

// Object * 77 Psc B  ---  Double or Multiple Star  ---  OID=@1405535   (@@29079,4)  ---  coobox=11407 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "77 Psc B/HIP 5144/Gaia DR3 2552059469815827456/WISEA J010551.46+045432.7/TIC 344755786/ADS 903 B/AG+04 137/BD+04 176/CCDM J01058+0455B/GC 1319/GCRV 627/GEN# +1.00006480/GSC 00022-01354/HD 6480/HIC 5144/HR 314/IDS 01006+0423 B/PPM 144256/SAO 109667/SKY# 1672/UBV 1089/UBV M 7921/YZ 4 287/uvby98 100006480/WDS J01058+0455B/IDS 01006+4203 B/** STF 90B/** TOK 202/WDS J01058+0455Ba,Bb/WEB 1068/Gaia DR2 2552059469815827456/UCAC4 475-001569/2MASS J01055144+0454339/WISE J010551.45+045432.7/EPIC 220409971"
{
	ParentBody      "77 Psc"
	BinaryOrbit     
	{
		Period          31324
		Separation      1462.41887260101 // 33.17 asec
	}
}

// Object TYC 22-1354-1  ---  High Proper Motion Star  ---  OID=@11639192   (@@-1,255)  ---  coobox=11407 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "TYC 22-1354-1/WDS J01058+0455Ba/** TOK 202Ba"
{
	DateUpdated     "2024-06-20"
	ParentBody      "77 Psc B"
	Parallax        22.6816
	AppMagn         6.35 // Stellarium
	Class           "F5/7(V)"
	AbsMagn         3.13 // 计算的值
	MassSol         1.18
	RadSol          1.2335 // Gaia DR3
	LumBol          2.02945352625651 // 计算的值
	Teff            6203
	FeH             -0.612

	BinaryOrbit     
	{
		Period          36.240
		Separation      47.6156744519996 // 1.08 asec
	}
}

// Object TYC 22-1354-2  ---  High Proper Motion Star  ---  OID=@1405772   (@@107124,31)  ---  coobox=11407 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "TYC 22-1354-2/** TOK 202Bb/WDS J01058+0455Bb"
{
	DateUpdated     "2024-06-20"
	ParentBody      "77 Psc B"
	Class           ""
	MassSol         0.62
}

// Object * 60 Psc  ---  Spectroscopic Binary  ---  OID=@1415014   (@@29355,0)  ---  coobox=11408 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Star,Infra-Red Source 
Star "60 Psc A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "60 Psc"
	Class           "G8III"
	AbsMagn         0.638 // 计算的值
	MassKg          3.32760333184548e+30 // log(g) = 2.746 cm/s^2
	RadSol          9.075 // Gaia DR3
	LumBol          48.2179151589664 // 计算的值
	Teff            5049
	FeH             -0.117

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.673181312
		Eccentricity    0.467217759
		Inclination     -1.10590553
		AscendingNode   0
		ArgOfPericenter -5.77046977
		MeanAnomaly     -110.679413
	}
}

Star "60 Psc B"
{
	ParentBody      "60 Psc"
	Class           "F1.6?"
}

// Object * 26 Cet  ---  High Proper Motion Star  ---  OID=@1390682   (@@28764,15)  ---  coobox=11403 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Star,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=875
Star "26 Cet A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "26 Cet"
	Class           "A8IV"
	AbsMagn         2.2 // 计算的值
	MassKg          2.95803174615565e+30 // log(g) = 4.039 cm/s^2
	RadSol          1.931 // Gaia DR3
	LumBol          10.265547509222 // 计算的值
	Teff            7435
	FeH             -0.559
}

Barycenter "26 Cet BC"
{
	ParentBody      "26 Cet"
	BinaryOrbit     
	{
		Period          17477
		Separation      946.21307458278 // 15.94 asec
	}
}

// Object * 26 Cet B  ---  High Proper Motion Star  ---  OID=@1391029   (@@82528,4)  ---  coobox=11403 
// Object types: Mid-IR Source (3 to 30 µm),High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,Optical Source 
Star "26 Cet B/WISE J010348.08+012155.9/UCAC4 457-001378/LAMOST J010348.24+012155.0/AP J01034801+0121562/Gaia DR3 2538159890493432448/TIC 344717788/GSC 00019-01459/TYC 19-1459-1/WDS J01038+0122B/ADS 875 B/AG+01 121/BD+00 174B/CCDM J01038+0122B/CSI+00 174 1/GCRV 607/GEN# +1.00006288B/HD 6288B/IDS 00587+0050 B/PPM 144220/UBV 1031/** STF 84B/2MASS J01034801+0121562/EPIC 220240741/WEB 1002/Gaia DR2 2538159890493432448"
{
	DateUpdated     "2024-06-20"
	ParentBody      "26 Cet BC"
	Parallax        16.925
	AppMagn         9.27
	Class           "G8V"
	AbsMagn         5.41 // 计算的值
	MassKg          1.73038836693789e+30 // log(g) = 4.488 cm/s^2
	RadSol          0.88075 // Gaia DR3
	LumBol          0.515723130406487 // 计算的值
	Teff            5212
	FeH             -0.07

	BinaryOrbit     
	{
		Period          1053
		Separation      107.533338820171 // 1.82 asec
	}
}

// Object * 26 Cet C  ---  High Proper Motion Star  ---  OID=@23646689   (@@-1,255)  ---  coobox=11403 
// Object types: High Proper Motion Star,Star 
Star "26 Cet C/Gaia DR3 2538159890493432320"
{
	DateUpdated     "2024-06-20"
	ParentBody      "26 Cet BC"
	Parallax        16.9878
	Class           ""
	MassSol         0.25
}

// Object HD 12235b  ---  Extra-solar Planet  ---  OID=@23935882   (@@-1,255)  ---  coobox=11814
// Object types: Extra-solar Planet,Star
Planet	"HD 12235 b"
{
	ParentBody     "HD 12235"
	DiscMethod     "RadVel"
	DiscDate       "2022"
	MassJup        0.033

	Orbit
	{
		Epoch           2447046.366
		PeriodDays      4.4
		SemiMajorAxis   0.053918
		Eccentricity    0.376428
		ArgOfPericen    279.4918
	}
}

// Object HD 12235c  ---  Extra-solar Planet  ---  OID=@23935883   (@@-1,255)  ---  coobox=11814
// Object types: Extra-solar Planet,Star
Planet	"HD 12235 c"
{
	ParentBody     "HD 12235"
	DiscMethod     "RadVel" // Astrometry
	DiscDate       "2022"
	MassJup        9.866

	Orbit
	{
		Epoch           2411054.478
		PeriodDays      36336.7
		SemiMajorAxis   22.21
		Eccentricity    0.174465
		Inclination     47.738
		ArgOfPericen    79.7724
	}
}