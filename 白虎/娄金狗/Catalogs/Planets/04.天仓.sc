// Object * 42 Cet  ---  Double or Multiple Star  ---  OID=@1372879   (@@28067,6)  ---  coobox=10749 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=6226
Star "42 Cet A/Gaia DR3 2533762977853808640/ADS 1081 A/BD-01 171A/CSI-01 171 2/WDS J01198-0031A/TYC 4682-1383-1/** STF 113A/PMSC 01147-0101A/HD 8036A/Gaia DR2 2533762977853808640"
{
	DateUpdated     "2024-06-24"
	ParentBody      "42 Cet"
	Parallax        7.7751
	AppMagn         6.45
	Class           "G8IV"
	AbsMagn         0.904 // 计算的值
	MassKg          4.67750693620738e+30 // log(g) = 2.889 cm/s^2
	RadSol          9.12616 // Gaia DR3
	LumBol          51.2829507934678 // 计算的值
	Teff            5113
	FeH             -0.101
}

// Object * 42 Cet B  ---  Double or Multiple Star  ---  OID=@1372881   (@@28067,8)  ---  coobox=10749 
// Object types: Double or Multiple Star,Star 
Barycenter "42 Cet BC/ADS 1081 BC/BD-01 171B/CSI-01 171 3/WDS J01198-0031BC/CCDM J01198-0031BC/TYC 4682-1383-2/** FIN 337/** FIN 337BC/HD 8036B"
{
	ParentBody      "42 Cet"
	BinaryOrbit // Tok 2021
	{
		Period          1000.0000
		Separation      146.022022323294 // 计算的值
		Eccentricity    0.540
		Inclination     37.9
		AscendingNode   123.1
		Epoch           2337114.152520012576133
		ArgOfPericenter 102.8
		MeanAnomaly     0
	}
}

Star "42 Cet B"
{
	DateUpdated     "2024-06-24"
	ParentBody      "42 Cet BC"
	Class           "A7IV:"
	MassSol         2.08

	BinaryOrbit // Tok 2021
	{
		Period          27.1300
		Separation      11.1761438475164 // 0.111 asec
		Eccentricity    0.205
		Inclination     18.5
		AscendingNode   41.2
		Epoch           2449689.103028292767704
		ArgOfPericenter 343.2
		MeanAnomaly     0
	}
}

Star "42 Cet C"
{
	DateUpdated     "2024-06-24"
	ParentBody      "42 Cet BC"
	Class           ""
	MassSol         1.81
}

// Object * 38 Cet  ---  High Proper Motion Star  ---  OID=@1372293   (@@28395,0)  ---  coobox=10743 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "38 Cet A"
{
	DateUpdated     "2024-06-24"
	ParentBody      "38 Cet"
	Class           "F3V"
	AbsMagn         2.55 // 计算的值
	MassKg          2.9842662047839e+30 // log(g) = 3.89 cm/s^2
	RadSol          2.3025 // Gaia DR3
	LumBol          8.02836230774917 // 计算的值
	Teff            6403
	FeH             -0.693

	BinaryOrbit     
	{
		Separation      251.493240948012 // 5.92 asec
	}
}

// Object * 38 Cet B  ---  High Proper Motion Star  ---  OID=@23015044   (@@-1,255)  ---  coobox=10743 
// Object types: High Proper Motion Star,Star 
Star "38 Cet B/Gaia DR3 2533660345315705344"
{
	ParentBody      "38 Cet"
	Class           "F7?"
}

// Object * 39 Cet  ---  RS CVn Variable  ---  OID=@1372229   (@@28058,0)  ---  coobox=10742 
// Object types: RS CVn Variable,High Proper Motion Star,Spectroscopic Binary,White Dwarf,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
Star "39 Cet A"
{
	DateUpdated     "2024-06-24"
	ParentBody      "39 Cet"
	Class           "G6III:eFe-2"
	AbsMagn         0.81
	MassSol         2.2
	RadSol          6.8
	LumBol          45
	Teff            5080
	FeH             -0.33
	RotationPeriod  1802.88
	Age             1.3

	BinaryOrbit     
	{
		PeriodDays      56.824
		SemiMajorAxisKm 5.57E6
		Eccentricity    0.0
		Epoch           2446336.205
	}
}

Star "39 Cet B"
{
	DateUpdated     "2024-06-24"
	ParentBody      "39 Cet"
	Class           "WD"
	MassSol         0.55
	RadSol          0.012
	LumBol          0.014
	Teff            18000
}

// Object * 37 Cet  ---  Double or Multiple Star  ---  OID=@1346412   (@@27509,6)  ---  coobox=10726 
// Object types: High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "37 Cet A"
{
	ParentBody      "37 Cet"
	BinaryOrbit     
	{
		Separation      1181.72830936361 // 49.13 asec
	}
}

Star "37 Cet Aa"
{
	DateUpdated     "2024-06-24"
	ParentBody      "37 Cet A"
	Class           "F5V"
	AbsMagn         3.22 // 计算的值
	MassKg          2.52246710803171e+30 // log(g) = 4.082 cm/s^2
	RadSol          1.697046 // Gaia DR3
	LumBol          4.20805277825335 // 计算的值
	Teff            6346
	FeH             -0.492

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.139822272
		Eccentricity    0
		Inclination     -0.121483803
		AscendingNode   0
		ArgOfPericenter -9.74220383
		MeanAnomaly     81.8399395
	}
}

Star "37 Cet Ab"
{
	ParentBody      "37 Cet A"
	Class           "G4.6?"
}

// Object HD 7438  ---  High Proper Motion Star  ---  OID=@1346411   (@@27509,5)  ---  coobox=10726 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "HD 7438/GJ 9045 B/GJ 54.2 B/Gaia DR3 2475331597059676288/TIC 284120758/2MASS J01142243-0754393/ADS 1003 B/BD-08 215/CCDM J01144-0755B/G 270-176/GC 1490/GCRV 718/GEN# +1.00007438/HERZ 168/LTT 683/NLTT 4121/PPM 183193/SAO 129192/SKY# 1882/TYC 5273-2652-1/UBV 1319/YZ 98 251/YZC 16 251/uvby98 100007438/WDS J01144-0755B/** STF 4003B/WISEA J011422.52-075436.4/Gaia DR1 2475331524044986880/WEB 1321/Gaia DR2 2475331597059676288"
{
	DateUpdated     "2024-06-24"
	ParentBody      "37 Cet"
	Parallax        41.6748
	AppMagn         7.87
	Class           "K1(V)"
	AbsMagn         5.97 // 计算的值
}

// Object HD 1461b  ---  Extra-solar Planet  ---  OID=@5187196   (@@-1,255)  ---  coobox=10574 
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet "HD 1461 b"
{
	ParentBody     "HD 1461"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	Mass           6.44

	Orbit
	{
		Epoch           2450366.936
		PeriodDays      5.77152
		SemiMajorAxis   0.0634
		Eccentricity    0.131
		ArgOfPericen   -10
	}
}

// Object HD 1461c  ---  Extra-solar Planet  ---  OID=@8685213   (@@-1,255)  ---  coobox=10574
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"HD 1461 c"
{
	ParentBody     "HD 1461"
	DiscMethod     "RadVel"
	DiscDate       "2015"
	Mass           5.59

	Orbit
	{
		PeriodDays      13.5052
		SemiMajorAxis   0.1117
		Eccentricity    0.228
		ArgOfPericen    22
	}
}

Planet	"HD 1461 c2(?)"
{
	ParentBody     "HD 1461"
	DiscMethod     "RadVel"
	DiscDate       "2010"

	Orbit
	{
		PeriodDays      400
	}
}

Planet	"HD 1461 d(?)"
{
	ParentBody     "HD 1461"
	DiscMethod     "RadVel"
	DiscDate       "2010"

	Orbit
	{
		PeriodDays      5000
	}
}

// Object * chi Cet  ---  High Proper Motion Star  ---  OID=@1317448   (@@27143,0)  ---  coobox=11039 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Blue Object,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=11171
Barycenter "CHI Cet A"
{
	ParentBody      "CHI Cet"
	BinaryOrbit     
	{
		Period          154000
		Separation      4321.02519849467 // 184.01 asec
	}
}

Star "CHI Cet Aa"
{
	DateUpdated     "2024-06-24"
	ParentBody      "CHI Cet A"
	Class           "F0V"
	AbsMagn         4.98
	MassSol         1.36
	Radius          1205248.23460214 // 计算的值
	LumBol          5.6
	Teff            6746
	FeH             0.14
	Age             1.2

	BinaryOrbit // VB6_Gln2007 EZ_Cet Gr.9
	{
		Period          6.7650
		Separation      1.24409978651839 // 0.053 asec
		Eccentricity    0.450
		Inclination     64.0
		AscendingNode   333.0
		Epoch           2449312.903563548345119
		ArgOfPericenter 65.0
		MeanAnomaly     0
	}
}

Star "CHI Cet Ab"
{
	DateUpdated     "2024-06-24"
	ParentBody      "CHI Cet A"
	Class           ""
	MassSol         0.58
}

// Object V* EZ Cet  ---  BY Dra Variable  ---  OID=@1317447   (@@27140,21)  ---  coobox=11039 
// Object types: High Proper Motion Star,BY Dra Variable,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Mid-IR Source (3 to 30 µm),Star,X-ray Source 
Barycenter "V* EZ Cet/GJ 9061 B/HIP 8486/Gaia DR3 2461045711199481472/2MASS J01492335-1042125/SPOCS 2525/NSV 15392/CHI Cet B/BD-11 351/CCDM J01495-1042B/GC 2210/GCRV 1019/GEN# +1.00011131/GSC 05278-02439/HD 11131/HIC 8486/IDS 01447-1111 B/PPM 210682/RBS 244/SAO 148033/SKY# 2693/SRS 4037/TYC 5278-2439-1/UBV 1837/UBV 1843/YZC 11 405/uvby98 100011131/1RXS J014923.8-104212/WDS J01496-1041B/** ENG 8B/AKARI-IRC-V1 J0149232-104213/WISEA J014923.22-104213.2/WEB 1802/Gaia DR2 2461045711199481472/** AMM 1A/WDS J01494-1042A/TIC 24910401"
{
	ParentBody      "CHI Cet"
}

Barycenter "EZ Cet A"
{
	ParentBody      "V* EZ Cet"
	BinaryOrbit     
	{
		Period          1259
		Separation      162.200955941799 // 6.78 asec
	}
}

Star "EZ Cet Aa"
{
	DateUpdated     "2024-06-24"
	ParentBody      "EZ Cet A"
	Parallax        41.8
	AppMagn         6.754
	Class           "G3V"
	AbsMagn         4.86 // 计算的值
	MassSol         0.99
	Radius          622701.598706276 // log(g) = 4.53 cm/s^2
	LumBol          0.819066659361853 // 计算的值
	Teff            5804
	FeH             -0.09

	BinaryOrbit // 2023A&A...674A.114B
	{
		PeriodDays      3358.8899
		Eccentricity    0.676
		Inclination     58.2
		AscendingNode   0.0
		ArgOfPericenter 52.6
		MeanAnomaly     0
	}
}

Star "EZ Cet Ab"
{
	DateUpdated     "2024-06-24"
	ParentBody      "EZ Cet A"
	Class           ""
	MassSol         0.40
}

// Object V* EZ Cet B  ---  High Proper Motion Star  ---  OID=@15596631   (@@-1,255)  ---  coobox=11039 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star 
Star "V* EZ Cet B/Gaia DR3 2461045814278696448/TIC 24910400/HD 11131B/** AMM 1B/WDS J01494-1042B/Gaia DR2 2461045814278696448/2MASS J01492330-1042066"
{
	DateUpdated     "2024-06-24"
	ParentBody      "V* EZ Cet"
	Class           ""
	MassSol         0.43
}
