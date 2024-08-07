// Object * 22 Cyg  ---  Spectroscopic Binary  ---  OID=@2952107   (@@60561,4)  ---  coobox=20340 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "22 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "22 Cyg"
	Class           "B5IV"
	AbsMagn         -3.18
	MassSol         7.9
	RadSol          5.6
	LumBol          7305
	Teff            15200
	Age             0.0373

	BinaryOrbit     
	{
		PeriodDays      78.2
		Eccentricity    0.17
		Epoch           2443734.5
		ArgOfPericenter 319
		MeanAnomaly     0
	}
}

Star "22 Cyg B"
{
	ParentBody      "22 Cyg"
	Class           "O9.7?"
}

// Object * 25 Cyg  ---  Be Star  ---  OID=@2927622   (@@60571,18)  ---  coobox=20339 
// Object types: Be Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "25 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "25 Cyg"
	Class           "B3IVe"
	AbsMagn         -2.87 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.313414729
		Eccentricity    0
		Inclination     1.9421885
		AscendingNode   0
		ArgOfPericenter -54.4993305
		MeanAnomaly     135.043199
	}
}

Star "25 Cyg B"
{
	ParentBody      "25 Cyg"
	Class           "A1.4?"
}

// Object * b01 Cyg  ---  RS CVn Variable  ---  OID=@2929303   (@@61104,2)  ---  coobox=20344 
// Object types: High Proper Motion Star,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),RS CVn Variable,Star,Infra-Red Source,X-ray Source 
Star "27 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "27 Cyg"
	Class           "G8.5IVa"
	AbsMagn         3.48
	MassSol         1.26
	RadSol          2.51
	LumBol          4.07
	Teff            5108
	FeH             -0.02
	Age             4.34

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.74131732
		Eccentricity    0.336189464
		Inclination     -2.34422874
		AscendingNode   0
		ArgOfPericenter -11.9479638
		MeanAnomaly     120.574448
	}
}

Star "27 Cyg B"
{
	ParentBody      "27 Cyg"
	Class           "G4.2?"
}

// Object * b02 Cyg  ---  Be Star  ---  OID=@2929904   (@@61133,0)  ---  coobox=20347 
// Object types: Be Star,Pulsating Variable,Mid-IR Source (3 to 30 µm),Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "28 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "28 Cyg"
	Class           "B2.5Ve"
	AbsMagn         -2.56
	MassSol         9.5
	DimensionsSol   (13, 11.4, 13)
	LumBol          1353.22
	Teff            11338
	Age             0.0221

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   157.561654
		Eccentricity    0.505541924
		Inclination     1.34603834
		AscendingNode   0
		ArgOfPericenter -112.153306
		MeanAnomaly     -107.870244
	}
}

Star "28 Cyg B"
{
	ParentBody      "28 Cyg"
	Class           "sdO"
}

// Object * b03 Cyg b  ---  Extra-solar Planet  ---  OID=@22822116   (@@-1,255)  ---  coobox=20347
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Remove "HIP 99770 b" {ParentBody "HIP 99770"}
Planet "b3 Cyg b/HIP 99770 b"
{
	ParentBody     "29 Cyg"
	DiscMethod     "Imaging"
	DiscDate       "2023"
	Class          "GasGiant"
	MassJup        13.9 // 16.1
	Radius         71492

	Orbit
	{
		PeriodDays      11900
		SemiMajorAxis   16.9
		Eccentricity    0.25
		Inclination     148
	}
}

// Object * 47 Cyg  ---  Red Supergiant  ---  OID=@2932882   (@@61988,12)  ---  coobox=20443 
// Object types: Double or Multiple Star,Red Supergiant,Spectroscopic Binary,Long-Period Variable,Variable Star,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=101474
Barycenter "47 Cyg A"
{
	ParentBody      "47 Cyg"
	BinaryOrbit     
	{
		Period          171.498
		Separation      320.751991617435 // 0.282 asec
	}
}

Star "47 Cyg Aa"
{
	DateUpdated     "2024-06-10"
	ParentBody      "47 Cyg A"
	Class           "K6Ib+"
	AbsMagn         -4
	MassSol         12.1
	RadSol          601
	LumBol          102909.8692307256 // 计算的值
	Teff            4217
	FeH             0.13
	Age             0.0176

	BinaryOrbit // 1992Obs.112.111  Griffin
	{
		PeriodDays      1117.0000
		Asini           0.206
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2447088.500
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "47 Cyg Ab"
{
	DateUpdated     "2024-06-10"
	ParentBody      "47 Cyg A"
	Class           ""
	MassSol         0.57
}

Star "47 Cyg B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "47 Cyg"
	Class           "B2.5"
	AbsMagn         -1.5
	MassSol         10.96
}

// Object * 35 Cyg  ---  Spectroscopic Binary  ---  OID=@2931966   (@@61633,5)  ---  coobox=20432 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "35 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "35 Cyg"
	Class           "F4I"
	AbsMagn         -3.99
	MassSol         10.0
	RadSol          51
	LumBol          7093
	Teff            6360
	FeH             0.02
	Age             0.022

	BinaryOrbit     
	{
		PeriodDays      2440
	}
}

Star "35 Cyg B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "35 Cyg"
	Class           "B6.5"
}

// Object * 39 Cyg  ---  Spectroscopic Binary  ---  OID=@2906567   (@@61658,2)  ---  coobox=20422 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "39 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "39 Cyg"
	Class           "K2.5IIIFe-0.5"
	AbsMagn         0.01
	MassSol         1.29
	RadSol          22.31
	LumBol          186
	Teff            4259
	FeH             0.00
	Age             3.86

	BinaryOrbit     
	{
		Period          85.67
		Asini           8.07
		Eccentricity    0.495
		Epoch           2453794
		ArgOfPericenter 357
		MeanAnomaly     0
	}
}

Star "39 Cyg B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "39 Cyg"
	Class           "F-K/WD?"
	MassSol         0.7 // 1
}

// Object * 49 Cyg  ---  Double or Multiple Star  ---  OID=@2933655   (@@62326,23)  ---  coobox=20464 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "49 Cyg A"
{
	ParentBody      "49 Cyg"
	BinaryOrbit     
	{
		PeriodDays      6835
		Separation      749.205940136421 // 2.76 asec
	}
}

Star "49 Cyg Aa"
{
	DateUpdated     "2024-06-10"
	ParentBody      "49 Cyg A"
	Class           "G8IIb"
	AbsMagn         -1.53 // 计算的值
	MassSol         3.68

	BinaryOrbit     
	{
		Period          143.206
		Separation      54.2861056520353 // 0.200 asec
	}
}

Star "49 Cyg Ab"
{
	ParentBody      "49 Cyg A"
	Class           "B5.2?"
}

// Object * 49 Cyg B  ---  Spectroscopic Binary  ---  OID=@2933657   (@@62327,0)  ---  coobox=20464 
// Object types: Spectroscopic Binary,Double or Multiple Star,Star 
Barycenter "49 Cyg B/Gaia DR3 1863091873103001088/BDS 10437 B/ADS 14158 B/BD+31 4181B/CCDM J20411+3218B/CSI+31 4181 3/GCRV 12964/GCRV 71305/HD 197178/WDS J20410+3218B/** STF 2716B/TYC 2690-1645-2/PMSC 20370+3157B/PMSC 20370+3157Bab/WEB 18454/Gaia DR2 1863091873103001088"
{
	ParentBody      "49 Cyg"
}

Star "49 Cyg Ba"
{
	DateUpdated     "2024-06-10"
	ParentBody      "49 Cyg B"
	Parallax        3.5974
	AppMagn         8.09
	Class           "B9.9"
	AbsMagn         0.87 // 计算的值
	MassSol         2.81

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.129856878
		Eccentricity    0
		Inclination     0.124294519
		AscendingNode   0
		ArgOfPericenter -34.3959773
		MeanAnomaly     -102.700506
	}
}

Star "49 Cyg Bb"
{
	ParentBody      "49 Cyg B"
	Class           "F6.8?"
}

// Object * 52 Cyg  ---  Star  ---  OID=@2907873   (@@62329,11)  ---  coobox=20455 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "52 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "52 Cyg"
	Class           "K0IIIa"
	AbsMagn         0.16 // 计算的值
	MassSol         2.07
	RadSol          13.81
	LumBol          89
	Teff            4677
	FeH             -0.24
	Age             2.27

	BinaryOrbit     
	{
		Separation      401.102575438286 // 6.17 asec
	}
}

// Object * 52 Cyg B  ---  Star  ---  OID=@2907875   (@@62329,13)  ---  coobox=20455 
// Object types: Double or Multiple Star,Star 
Star "52 Cyg B/Gaia DR3 1859330929163344000/Gaia DR2 1859330929163344000/ADS 14259 B/BD+30 4167B/CCDM J20457+3043B/CSI+30 4167 2/WDS J20456+3043B/** STF 2726B/TYC 2687-2652-1/UCAC4 604-113466/CSI+30-20436/GCRV 13013"
{
	DateUpdated     "2024-06-10"
	ParentBody      "52 Cyg"
	Class           ""
	AbsMagn         -0.695 // 计算的值
	MassKg          1.65607571599731e+30 // log(g) = 4.344 cm/s^2
	RadSol          1.017 // Gaia DR3
	LumBol          0.814278402838213 // 计算的值
	Teff            5437
	FeH             -1.806
}

// Object * 26 Vul  ---  Spectroscopic Binary  ---  OID=@2852453   (@@62039,8)  ---  coobox=20382 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "26 Vul A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "26 Vul"
	Class           "A5III"
	AbsMagn         -0.04
	RadSol          4.6
	LumBol          79.75
	Teff            7888

	BinaryOrbit     
	{
		PeriodDays      11.088
		Eccentricity    0.28
		Epoch           2426492.6090
		ArgOfPericenter 230.1
		MeanAnomaly     0
	}
}

Star "26 Vul B"
{
	ParentBody      "26 Vul"
	Class           "A9.1?"
}

// Object * 30 Vul  ---  Spectroscopic Binary  ---  OID=@2852869   (@@62362,13)  ---  coobox=20406 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Spectroscopic Binary,Star,Infra-Red Source 
Remove "30 Vul A" {ParentBody "30 Vul"}
Remove "30 Vul B" {ParentBody "30 Vul"}
Star "30 Vul A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "Gaia DR3 1843569258170830848"
	Class           "K1III"
	AbsMagn         -0.07
	MassSol         1.55
	RadSol          21.68
	LumBol          173.3
	Teff            4498
	FeH             -0.10
	Age             4.20

	BinaryOrbit     
	{
		PeriodDays      2506
		Asini           1.00
		Eccentricity    0.383
		Epoch           2442511
		ArgOfPericenter 92
		MeanAnomaly     0
	}
}

Star "30 Vul B"
{
	ParentBody      "Gaia DR3 1843569258170830848"
	Class           "G0.6?"
}

// Object * 31 Vul  ---  Spectroscopic Binary  ---  OID=@2876689   (@@62648,7)  ---  coobox=20456 
// Object types: Spectroscopic Binary,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "31 Vul A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "31 Vul"
	Class           "G7IIIFe-1"
	AbsMagn         0.77
	MassSol         2.40
	RadSol          8.01
	LumBol          52.53
	Teff            5261
	FeH             -0.05
	Age             0.700

	BinaryOrbit     
	{
		PeriodDays      1860.6
		Asini           0.69
		Eccentricity    0.375
		Epoch           2452316
		ArgOfPericenter 195.1
		MeanAnomaly     0
	}
}

Star "31 Vul B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "31 Vul"
	Class           "WD"
	MassSol         0.4
}

// Object * 61 Cyg A  ---  BY Dra Variable  ---  OID=@837   (@@10880,0)  ---  coobox=11 
// Object types: Rotating Variable,BY Dra Variable,High Proper Motion Star,Variable Star,High Proper Motion Star,Eruptive Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,X-ray Source 
Remove "61 Cyg A" {ParentBody "61 Cyg"}
Remove "61 Cyg B" {ParentBody "61 Cyg"}
Star "61 Cyg A/GJ 820 A/Gaia DR3 1872046609345556480/TIC 165602000/PPM 86045/PLX 5077/LSPM J2106+3844N/ASCC 531487/2MASS J21065341+3844529/USNO-B1.0 1287-00443357/2RE J210651+384359/2RE J2106+384/8pc 287.13A/ADS 14636 A/AG+38 2138/BD+38 4343/CCDM J21069+3844A/CSI+38 4343 1/Ci 20 1259/GC 29509/GCRV 13272/GEN# +1.00201091A/HD 201091/HIC 104214/HIP 104214/HR 8085/IRC +40469/JP11 3309/LFT 1604/LHS 62/LTT 16179/NLTT 50559/NSV 13543/ROT 3077/SAO 70919/SKY# 40143/UBV 18285/USNO 900/V* V1803 Cyg/Zkh 315/[B10] 5433/[GKL99] 398/[RHG95] 3300/1E 2104.8+3831/2EUVE J2106+38.7/EUVE J2106+38.7/RX J2106.8+3844/WDS J21069+3845A/TYC 3168-2800-1/WEB 18980/Gaia DR2 1872046574983507456/Karmn J21068+387"
{
	DateUpdated     "2024-06-10"
	ParentBody      "IDS 21024+3815 AB"
	Class           "K5V"
	AbsMagn         7.506
	MassSol         0.70
	RadSol          0.665
	LumBol          0.153
	Teff            4526
	FeH             -0.20
	RotationPeriod  852.96
	Age             6.1

	BinaryOrbit     
	{
		Period          678
		Separation      84.8686464326287 // 24.272 asec
		Eccentricity    0.49
		Inclination     51
		AscendingNode   178
		Epoch           2345259.053552829194814
		ArgOfPericenter 329
		MeanAnomaly     0
	}
}

// Object * 61 Cyg B  ---  Eruptive Variable  ---  OID=@676   (@@10871,0)  ---  coobox=11 
// Object types: Rotating Variable,Eruptive Variable,High Proper Motion Star,Eruptive Variable,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Star,X-ray Source 
Star "61 Cyg B/GJ 820 B/AP J21065473+3844265/Gaia DR3 1872046574983497216/TIC 165602023/ASCC 531491/2MASS J21065473+3844265/USNO-B1.0 1287-00443364/8pc 285.42B/AC2000 1382649/ADS 14636 B/AG+38 2136/BD+38 4344/CCDM J21069+3844B/Ci 20 1260/GCRV 13273/GEN# +1.00201092/GSC 03168-02798/HD 201092/HIC 104217/HIP 104217/HR 8086/JP11 3313/LFT 1605/LHS 63/LTT 16180/NLTT 50560/NSV 13546/PPM 86049/ROT 3078/SKY# 40146/TYC 3168-2798-1/UBV M 25458/UBV 18286/USNO 901/Zkh 316/[B10] 5434/[GKL99] 399/[RHG95] 3301/uvby98 100201092/LSPM J2106+3844S/WDS J21069+3845B/WEB 18981/Gaia DR2 1872046574983497216/Karmn J21069+387"
{
	DateUpdated     "2024-06-10"
	ParentBody      "IDS 21024+3815 AB"
	Parallax        286.0054
	AppMagn         6.03
	Class           "K7V"
	AbsMagn         8.228
	MassSol         0.63
	RadSol          0.595
	LumBol          0.085
	Teff            4077
	FeH             -0.27
	RotationPeriod  829.2
	Age             6.1
}

// Object * lam Cyg A  ---  Double or Multiple Star  ---  OID=@8447724   (@@-1,255)  ---  coobox=20471 
// Object types: Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=102589
Remove "LAM Cyg A" {ParentBody "LAM Cyg"}
Remove "LAM Cyg Aa" {ParentBody "LAM Cyg A"}
Remove "LAM Cyg Ab" {ParentBody "LAM Cyg A"}
Remove "LAM Cyg B" {ParentBody "LAM Cyg"}
Barycenter "LAM Cyg A/Gaia DR3 1870779903225039872/BD+35 4267A/HD 198183A/CCDM J20475+3629AP/WDS J20474+3629A/WDS J20474+3629Aa,Ab/** STT 413A/** MCA 63/TYC 2699-3425-1/PMSC 20435+3607Aab/Gaia DR2 1870779903225039872"
{
	ParentBody      "2MASS J20472452+3629268"
	BinaryOrbit // Tok 2020 poorly constrained
	{
		Period          1500.0000
		Separation      311.818168437539 // 1.330 asec
		Eccentricity    0.489
		Inclination     148.1
		AscendingNode   215.1
		Epoch           2409359.059438894502819
		ArgOfPericenter 135.6
		MeanAnomaly     0
	}
}

Star "LAM Cyg Aa"
{
	DateUpdated     "2024-06-10"
	ParentBody      "Gaia DR3 1870779903225039872"
	Class           "B5Ve"
	AbsMagn         -2.32 // 计算的值
	MassSol         6.40
	RadSol          3.56
	LumBol          429.31344491504154 // 计算的值
	Teff            13925

	BinaryOrbit // Tok 2020
	{
		Period          12.3700
		Separation      10.7885762622737 // 0.046 asec
		Eccentricity    0.540
		Inclination     140.1
		AscendingNode   136.6
		Epoch           2445163.752185395918787
		ArgOfPericenter 267.9
		MeanAnomaly     0
	}
}

Star "LAM Cyg Ab"
{
	DateUpdated     "2024-06-10"
	ParentBody      "Gaia DR3 1870779903225039872"
	Class           "B5?"
	MassSol         6.40
}

// Object * lam Cyg B  ---  Star  ---  OID=@2957595   (@@62298,2)  ---  coobox=20471 
// Object types: Double or Multiple Star,Star 
Star "LAM Cyg B/Gaia DR3 1870779903236215040/TIC 504016644/ADS 14296 B/BD+35 4267B/CSI+35 4267 3/IDS 20435+3607 B/WDS J20474+3629B/PMSC 20435+3607B/HD 198183B/** STT 413B/TYC 2699-3425-2/Gaia DR2 1870779903236215040"
{
	DateUpdated     "2024-06-10"
	ParentBody      "2MASS J20472452+3629268"
	Class           "B7V"
	MassSol         5.12
}

// Object * 57 Cyg  ---  Spectroscopic Binary  ---  OID=@58348   (@@10593,0)  ---  coobox=55 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,UV-emission Source,X-ray Source 
Star "57 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "57 Cyg"
	Class           "B5V"
	AbsMagn         -1.23
	MassSol         5.54
	RadSol          3.3
	LumBol          856.6926971264044 // 计算的值
	Teff            17190

	BinaryOrbit     
	{
		PeriodDays      2.8548
		Eccentricity    0.139
		Inclination     48
		Epoch           2441571.275
		ArgOfPericenter 339.6
		MeanAnomaly     0
	}
}

Star "57 Cyg B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "57 Cyg"
	Class           ""
	MassSol         4.92
	RadSol          2.9
}

// Object * ome01 Cyg  ---  Pulsating Variable  ---  OID=@153871   (@@10323,0)  ---  coobox=122 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "OME1 Cyg (AB)"{ParentBody "OME1 Cyg"}
Remove "OME1 Cyg A"{ParentBody "OME1 Cyg (AB)"}
Remove "OME1 Cyg B"{ParentBody "OME1 Cyg (AB)"}
Remove "OME1 Cyg C"{ParentBody "OME1 Cyg"} // 目前已证实为单星

// Object * omi02 Cyg  ---  Spectroscopic Binary  ---  OID=@153522   (@@10636,0)  ---  coobox=114 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Variable Star,Eclipsing Binary,Star,Infra-Red Source,UV-emission Source 
Remove "OMI2 Cyg A" {ParentBody "OMI2 Cyg"}
Remove "OMI2 Cyg B" {ParentBody "OMI2 Cyg"}
Star "32 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "32 Cyg"
	Class           "K5Iab"
	AbsMagn         -3.56
	MassSol         7.45
	RadSol          277
	LumBol          16600 // 17500
	Teff            3986
	FeH             -0.43
	Age             0.020

	BinaryOrbit     
	{
		PeriodDays      1147.8
		Separation      1.57367558477094 // 5.50 mas
		Eccentricity    0.300
		Inclination     65.50
		Epoch           2433141.8
		ArgOfPericenter 38.20
		MeanAnomaly     0
	}
}

Star "32 Cyg B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "32 Cyg"
	Class           "B7V"
	MassSol         4.13
	RadSol          3.0
	LumBol          302
	Teff            16200
}

// Object * 31 Cyg  ---  Spectroscopic Binary  ---  OID=@5539709   (@@-1,255)  ---  coobox=112 
// Object types: Spectroscopic Binary,Eclipsing Binary,Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Remove "OMI1 Cyg A" {ParentBody "OMI1 Cyg"}
Remove "OMI1 Cyg B" {ParentBody "OMI1 Cyg"}
Barycenter "31 Cyg A"
{
	ParentBody      "HIP 99675"
	BinaryOrbit     
	{
		Separation      36647.5807664617 // 106.89 asec
	}
}

Star "31 Cyg Aa"
{
	DateUpdated     "2024-06-10"
	ParentBody      "31 Cyg A"
	Class           "K3Ib"
	AbsMagn         -3.88 // 计算的值
	MassSol         6.73
	RadSol          127
	LumBol          2512 // 2599
	Teff            4043

	BinaryOrbit     
	{
		PeriodDays      3784.3
		Eccentricity    0.2084
		Epoch           2452345
		ArgOfPericenter 24.5
		MeanAnomaly     0
	}
}

Star "31 Cyg Ab"
{
	DateUpdated     "2024-06-10"
	ParentBody      "31 Cyg A"
	Class           "B2IV-V"
	MassSol         5.22
	RadSol          5.2
	LumBol          1805.6606859427397 // 计算的值
	Teff            16500
	Age             0.0398
}

// Object * 31 Cyg B  ---  Star  ---  OID=@153376   (@@10625,5)  ---  coobox=112 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "31 Cyg B/HIP 99676/Gaia DR3 2082600680879393408/TIC 378267987/ADS 13554 C/AG+46 1596/BD+46 2883/CCDM J20135+4646C/CEL 4981/GC 28101/GCRV 70716/GEN# +1.00192579/GSC 03559-02607/HD 192579/HIC 99676/PPM 59525/ROT 2939/SAO 49338/SKY# 38107/TYC 3559-2607-1/UBV 17507/UBV M 24645/2MASS J20133920+4642426/ALS 20014/WDS J20136+4644C/** STF 4050C/WEB 17876/Gaia DR2 2082600680879393408/** STFA 50C"
{
	DateUpdated     "2024-06-10"
	ParentBody      "HIP 99675"
	Parallax        2.916
	AppMagn         6.99
	Class           "B5V"
	AbsMagn         -0.69 // 计算的值
	MassSol         4.1
	RadSol          3.3
	LumBol          373
	Teff            13949
	FeH             0.68
}

// Object V* T Cyg  ---  Long-Period Variable Candidate  ---  OID=@2957888   (@@62315,0)  ---  coobox=20470 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,Long-Period Variable Candidate 
Star "V* T Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "V* T Cyg"
	Class           "K3III"
	AbsMagn         -0.74
	MassSol         3.82040488422189 // log(g) = 2.12 cm/s^2
	RadSol          28.19
	LumBol          241.4
	Teff            4285
	FeH             -0.12

	BinaryOrbit     
	{
		Epoch           2455928
		Separation      1040.67634619866 // 8.10 asec
		PositionAngle   120
	}
}

// Object V* T Cyg B  ---  Star  ---  OID=@2957883   (@@62314,19)  ---  coobox=20470 
// Object types: Variable Star,Double or Multiple Star,Star 
Star "V* T Cyg B/HD 198134B/Gaia DR3 1869341845103356928/ADS 14290 B/CCDM J20472+3422B/CSI+33 4028 2/GEN# +1.00198134B/WDS J20472+3422B/** BU 677B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "V* T Cyg"
	Class           ""
	MassKg          1.63646431889669e+30 // log(g) = 4.487 cm/s^2
	RadSol          0.8575 // Gaia DR3
	LumBol          0.371407230341124 // 计算的值
	Teff            4866
	FeH             -0.178
}
