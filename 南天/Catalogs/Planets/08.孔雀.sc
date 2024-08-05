// Object HD 172555  ---  High Proper Motion Star  ---  OID=@3416858   (@@70243,6)  ---  coobox=23819 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=172555
Star "HD 172555 A"
{
	DateUpdated     "2024-08-04"
	ParentBody      "HD 172555"
	Class           "A7V"
	AbsMagn         2.47 // 计算的值
	MassSol         1.7
	RadSol          1.55
	LumBol          7.8
	Teff            7800
	FeH             0.07
	Age             0.02 // 0.012
}

// Object CD-64 1208  ---  Spectroscopic Binary  ---  OID=@3416942   (@@70246,30)  ---  coobox=23819 
// Object types: Double or Multiple Star,High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Star,X-ray Source 
Barycenter "CD-64 1208/Gaia DR3 6438274728259539072/Gaia DR2 6438274728259539072/TIC 464405840/CPC 21 4375/CPD-64 3950/PPM 782148/2MASS J18453704-6451460/TYC 9077-2489-1/1RXS J184538.1-645144/RX J1845.6-6451/ASAS J184537-6451.8/** BIL 4/** SKF 105B/WDS J18454-6452B/WDS J18454-6452Ba,Bb/WISEA J184537.07-645147.5/UCAC4 126-177671/PM J18456-6451/WT 588/WISE J184537.06-645147.4"
{
	ParentBody      "HD 172555"
	BinaryOrbit     
	{
		Period          58446
		Separation      2000
	}
}

Barycenter "CD-64 1208 Ba"
{
	ParentBody      "CD-64 1208"
	BinaryOrbit     
	{
		Period          21.717
		Separation      7.22622806909139 // 0.251 asec
	}
}

Star "CD-64 1208 Ba1"
{
	DateUpdated     "2024-08-04"
	ParentBody      "CD-64 1208 Ba"
	Class           "K5Ve"
	MassSol         0.70

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0698487481
		Eccentricity    0
		Inclination     0.0872352123
		AscendingNode   0
		ArgOfPericenter 233.793943
		MeanAnomaly     13.1096672
	}
}

Star "CD-64 1208 Ba2"
{
	DateUpdated     "2024-08-04"
	ParentBody      "CD-64 1208 Ba"
	Class           ""
	MassSol         0.70
}

Star "CD-64 1208 Bb"
{
	DateUpdated     "2024-08-04"
	ParentBody      "CD-64 1208"
	Class           ""
	MassSol         0.10
}

// 2023年在HD 172555边上发现一颗系外彗星
// 参考文献: https://arxiv.org/abs/2301.07418
Comet "HD 172555 Exocomet" // 瞎编的号
{
	ParentBody     "HD 172555 A"
	DiscMethod     "Transit"
	DiscDate       "2023"
	Radius         2.5
	AbsMagn        -1 // ?

	Orbit
	{
		Epoch           2459381.445 // t0
		PericenterDist  0.05
		Eccentricity    0.9 // 原文没给
		MeanAnomaly     0
	}
}

// Object * ksi Pav  ---  Spectroscopic Binary  ---  OID=@3447940   (@@69691,11)  ---  coobox=23832 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=90098
Barycenter "KSI Pav/HIP 90098/Gaia DR3 6634378296431076864/TIC 365897786/PLX 4202.2/SBC9 1042/AAVSO 1814-61/CPC 20.1 5548/CPD-61 6140/FK5 686/GC 25045/GCRV 10823/GSC 09068-02823/HD 168339/HIC 90098/HR 6855/IRAS 18186-6131/N30 4075/NSV 10673/PPM 363303/SACS 402/SAO 254226/SBC7 673/SKY# 33551/TD1 22148/TYC 9068-2823-1/UBV 15588/[DS98] 259/2MASS J18231360-6129378/** GLE 2A/CCDM J18232-6130A/GEN# +1.00168339/IDS 18140-6132 A/WDS J18232-6130A/WEB 15401/Gaia DR2 6634378296429537920"
{
	ParentBody      "CCDM J18232-6130"

}

Star "KSI Pav Aa"
{
	DateUpdated     "2024-08-04"
	ParentBody      "KSI Pav"
	Class           "K4III"
	AbsMagn         -1.16
	MassSol         5.05
	RadSol          54.82
	LumBol          729
	Teff            4051

	BinaryOrbit // VB6_Jnc2005 GLE_2A Gr.9
	{
		PeriodDays      2214
		Separation      7.0376911641591 // 0.031 asec
		Eccentricity    0.260
		Inclination     56.0
		AscendingNode   54.6
		Epoch           2418076.294997200835496
		ArgOfPericenter 7.2
		MeanAnomaly     0
	}
}

Star "KSI Pav Ab"
{
	DateUpdated     "2024-08-04"
	ParentBody      "KSI Pav"
	Class           ""
	MassSol         5.43
}

// Object ** GLE 2B  ---  Star  ---  OID=@14866504   (@@-1,255)  ---  coobox=23832 
// Object types: Double or Multiple Star,Star 
Star "** GLE 2B/Gaia DR3 6634378296429537536/Gaia DR2 6634378296429537536/CCDM J18232-6130B/WDS J18232-6130B"
{
	DateUpdated     "2024-08-04"
	ParentBody      "CCDM J18232-6130"
	Class           ""
	MassSol         1.39

	Orbit     
	{
		Period          2538
		SemiMajorAxis   783.360942872314 // 3.45 asec
	}
}

Star "CCDM J18232-6130 C"
{
	DateUpdated     "2024-08-04"
	ParentBody      "CCDM J18232-6130"
	Class           "WD"
	MassSol         0.50

	Orbit     
	{
		Period          8762
		SemiMajorAxis   1881.42870661053 // 8.286 asec
	}
}