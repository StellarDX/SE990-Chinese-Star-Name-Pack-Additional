// Object * ome And  ---  Double or Multiple Star  ---  OID=@9145   (@@2559,12)  ---  coobox=2217 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "OME And A" {ParentBody "OME And"}
Remove "OME And B" {ParentBody "OME And"}
Star "OME And A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 6813"
	Class           "F3V"
	AbsMagn         2.57
	MassSol         0.963
	RadSol          2.2
	LumBol          7.1
	Teff            6628
	FeH             -0.16
	Age             2.1

	BinaryOrbit     
	{
		Separation      19.2609590708379 // 0.669 asec
	}
}

Star "OME And B"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 6813"
	Class           "F5V"
	MassSol         0.860
}

// Object * eps Tri  ---  Variable Star  ---  OID=@1547737   (@@32402,13)  ---  coobox=12134 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "EPS Tri A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "EPS Tri"
	Class           "A2V"
	AbsMagn         0.11
	MassSol         2.75
	RadSol          3.28
	LumBol          93
	Teff            10000
	Age             0.600

	BinaryOrbit     
	{
		Separation      428.322074190113 // 3.9 asec
	}
}

Star "EPS Tri B"
{
	ParentBody      "EPS Tri"
	Class           "A4.3?"
}

// Object * iot Tri A  ---  Spectroscopic Binary  ---  OID=@5423515   (@@-1,255)  ---  coobox=12138 
// Object types: Spectroscopic Binary,Ellipsoidal Variable,Variable Star,Spectroscopic Binary,Double or Multiple Star,Star 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=10280
Remove "IOT Tri A"{ParentBody "IOT Tri"}
Remove "IOT Tri B"{ParentBody "IOT Tri"}
Remove "IOT Tri Aa"{ParentBody "IOT Tri A"}
Remove "IOT Tri Ab"{ParentBody "IOT Tri A"}
Remove "IOT Tri Ba"{ParentBody "IOT Tri B"}
Remove "IOT Tri Bb"{ParentBody "IOT Tri B"}
Barycenter "IOT Tri A/CCABS 18/CABS 17/V* TZ Tri/Gaia DR3 300312157810876544/ADS 1697 A/SBC7 78/SBC9 112/GCRV 1199/CSI+29 371 2/TYC 2309-1821-1/HD 13480A/CCDM J02124+3018A/WDS J02124+3018A/PMSC 02066+2950A/PMSC 02066+2950Aab/BD+29 371A/* 6 Tri A/** STF 227A/Gaia DR2 300312157810876544"
{
	ParentBody      "HIP 10280"
	BinaryOrbit     
	{
		Period          2158
		Separation      347.59366568012 // 3.90 asec
	}
}

Star "IOT Tri Aa"
{
	DateUpdated     "2024-06-25"
	ParentBody      "Gaia DR3 300312157810876544"
	Parallax        11.3011
	AppMagn         5.162
	Class           "G0III"
	AbsMagn         0.43 // 计算的值
	MassSol         2.50
	Radius          7484651.96258426 // 4.0 RSun
	LumBol          61.7
	Teff            4932

	BinaryOrbit // SB9_112 2008AJ....135..209M (Combined)
	{
		PeriodDays      14.7302
		Eccentricity    0.004
		Inclination     55.4
		AscendingNode   80.0
		Epoch           2453353
		ArgOfPericenter 209.0
		MeanAnomaly     0
	}
}

Star "IOT Tri Ab"
{
	DateUpdated     "2024-06-25"
	ParentBody      "Gaia DR3 300312157810876544"
	Class           "G5III"
	MassSol         2.43
}

// Object * iot Tri B  ---  Spectroscopic Binary  ---  OID=@1536889   (@@32171,1)  ---  coobox=12138 
// Object types: Spectroscopic Binary,Double or Multiple Star,Star 
Barycenter "IOT Tri B/Gaia DR3 300312157810876160/SBC9 113/* 6 Tri B/ADS 1697 B/BD+29 371B/CCDM J02124+3018B/CSI+29 371 3/GCRV 1200/HD 13480B/SBC7 79/TYC 2309-1820-1/WDS J02124+3018B/PMSC 02066+2950Bab/PMSC 02066+2950B/UCAC4 602-005830/** STF 227B/WEB 2142/Gaia DR2 300312157810876160"
{
	ParentBody      "HIP 10280"
}

Star "IOT Tri Ba"
{
	DateUpdated     "2024-06-25"
	ParentBody      "Gaia DR3 300312157810876160"
	Parallax        12.7375
	AppMagn         6.613
	Class           "F5V"
	AbsMagn         0.20
	MassSol         1.58
	RadSol          1.5
	LumBol          10.0
	Teff            6486

	BinaryOrbit // SB9_113 1936ApJ....84...85L
	{
		PeriodDays      2.2365
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2422653.719
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "IOT Tri Bb"
{
	DateUpdated     "2024-06-25"
	ParentBody      "Gaia DR3 300312157810876160"
	Class           ""
	MassSol         1.56
}

// Object * 14 Tri  ---  Spectroscopic Binary  ---  OID=@1598543   (@@33439,0)  ---  coobox=12254 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Star "14 Tri A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "14 Tri"
	Class           "K5III"
	AbsMagn         -0.46
	MassSol         1.85
	RadSol          40.5
	LumBol          373
	Teff            3957
	FeH             -0.16

	BinaryOrbit     
	{
		PeriodDays      6257
		Eccentricity    0.22
		Epoch           2448284
		ArgOfPericenter 220
		MeanAnomaly     0
	}
}

Star "14 Tri B"
{
	DateUpdated     "2024-06-25"
	ParentBody      "14 Tri"
	Class           "M/WD?"
}

// Object * 59 And A  ---  Star  ---  OID=@1597814   (@@33418,1)  ---  coobox=12159 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "59 And A/HIP 10176/Gaia DR3 332409925884477568/TIC 184690815/2MASS J02105282+3902223/ADS 1683 A/AG+38 232/BD+38 425A/CCDM J02109+3902A/CEL 216/CSI+38 425 2/GC 2600/GCRV 1179/GEN# +1.00013294/GSC 02830-02553/HD 13294/HIC 10176/HR 628/IDS 02048+3834 A/N30 443/PPM 67045/ROT 303/SAO 55330/SKY# 3206/TYC 2830-2553-1/UBV 2172/WDS J02109+3902A/WEB 2123/Gaia DR2 332409925884477568"
{
	DateUpdated     "2024-06-25"
	ParentBody      "59 And"
	Parallax        7.4763
	AppMagn         6.07
	Class           "B9V"
	AbsMagn         0.44 // 计算的值
	RadSol          2.73
	LumBol          83.97
	Teff            10870

	BinaryOrbit     
	{
		Epoch           2457754
		Separation      1370
		PositionAngle   36
	}
}

// Object * 59 And B  ---  Star  ---  OID=@1597880   (@@33424,5)  ---  coobox=12159 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "59 And B/HIP 10180/Gaia DR3 332409925884476928/TIC 184690812/2MASS J02105366+3902358/ADS 1683 B/AG+38 233/BD+38 425B/CCDM J02109+3902B/CSI+38 425 1/GC 2602/GCRV 1181/GEN# +1.00013295/GSC 02830-02552/HD 13295/HIC 10180/HR 629/IDS 02048+3834 B/PPM 67046/ROT 304/SAO 55331/TYC 2830-2552-1/UBV M 8735/WDS J02109+3902B/** STF 222B/Gaia DR1 332409921586867328/WEB 2124/WEB 2126/Gaia DR2 332409925884476928"
{
	DateUpdated     "2024-06-25"
	ParentBody      "59 And"
	Parallax        7.4108
	AppMagn         6.1
	Class           "A1Vn"
	AbsMagn         0.45 // 计算的值
	MassSol         2.23
	RadSol          2.59
	LumBol          30.4
	Teff            9498
}

// Object * b And  ---  Spectroscopic Binary  ---  OID=@26318   (@@1664,11)  ---  coobox=2597 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Star,Infra-Red Source 
Barycenter "60 And A"
{
	ParentBody      "60 And"
	BinaryOrbit     
	{
		Separation      41.7987905797103 // 0.22 asec
	}
}

Star "60 And Aa"
{
	DateUpdated     "2024-06-25"
	ParentBody      "60 And A"
	Class           "K3.5IIIBa0.4"
	AbsMagn         -1.57 // 计算的值
	MassSol         2.0
	Radius          23013219.5777229 // log(g) = 1.70 cm/s^2
	LumBol          266.2805292604188 // 计算的值
	Teff            4054
	FeH             -0.13

	BinaryOrbit     
	{
		PeriodDays      748.2
		Separation      0.786837792385469 // 2.4 mas
		Eccentricity    0.80
		Inclination     54.1
		AscendingNode   344.5
		Epoch           2437886
		ArgOfPericenter 178
		MeanAnomaly     0
	}
}

Star "60 And Ab"
{
	DateUpdated     "2024-06-25"
	ParentBody      "60 And A"
	Class           "WD"
	MassSol         0.5
}

Star "60 And B"
{
	ParentBody      "60 And"
	Class           "A4.8?"
}

// Object * 2 Per  ---  Spectroscopic Binary  ---  OID=@84363   (@@2581,0)  ---  coobox=2236 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "2 Per A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "2 Per"
	Class           "B9VpHgMn"
	AbsMagn         -0.14
	MassSol         3.2
	RadSol          3.7
	LumBol          156
	Teff            11218
	FeH             -0.74
	Age             0.233

	BinaryOrbit     
	{
		PeriodDays      5.62698
		Eccentricity    0.024
		Epoch           2440281.3
		ArgOfPericenter 208
		MeanAnomaly     0
	}
}

Star "2 Per B"
{
	ParentBody      "2 Per"
	Class           "A8.3?"
}