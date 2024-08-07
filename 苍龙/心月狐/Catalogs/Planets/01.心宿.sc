// Object * 12 Sco A  ---  Double or Multiple Star  ---  OID=@2378054   (@@50380,19)  ---  coobox=16609 
// Object types: Double or Multiple Star,Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=79399
Barycenter "12 Sco A/Gaia DR3 6042159790157494912/ADS 9953 A/CD-28 11962A/CSI-28 11962 22/WDS J16123-2825Aa,Ab/TYC 6805-1907-1/** HJ 4839A/** HUB 16/WDS J16123-2825A/HD 145483A/c1 Sco A/Gaia DR2 6042159790157494912"
{
	ParentBody      "12 Sco"
	BinaryOrbit     
	{
		Period          3150
		Separation      334.883840124294 // 3.60 asec
	}
}

Star "12 Sco Aa"
{
	DateUpdated     "2024-05-29"
	ParentBody      "12 Sco A"
	Parallax        9.9483
	AppMagn         5.8
	Class           "B9V"
	AbsMagn         0.56
	MassSol         2.939
	Radius          1700723.79122083 // 计算的值
	LumBol          91
	Teff            11402
	Age             0.150

	BinaryOrbit     
	{
		Period          46.324
		Separation      20.3059038675047 // 0.202 asec
	}
}

Star "12 Sco Ab"
{
	DateUpdated     "2024-05-29"
	ParentBody      "12 Sco A"
	Class           "K7.9IVXR?"
	MassSol         1.46
}

// Object * 12 Sco B  ---  Star  ---  OID=@2378387   (@@111807,5)  ---  coobox=16609 
// Object types: Double or Multiple Star,Star 
Star "12 Sco B/Gaia DR3 6042159790157494784/HD 145483B/WDS J16123-2825B/ADS 9953 B/CD-28 11962B/CSI-28 11962 23/** HJ 4839B/TYC 6805-1907-2/Gaia DR2 6042159790157494784/c1 Sco B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "12 Sco"
	Parallax        10.5471
	Class           "F3V"
	MassSol         1.42
}

// Object * c02 Sco  ---  Spectroscopic Binary  ---  OID=@2400785   (@@50694,3)  ---  coobox=16612 
// Object types: Spectroscopic Binary,Rotating Variable,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "13 Sco A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "13 Sco"
	Class           "B2V"
	AbsMagn         -1.27 // 计算的值
	MassSol         7.80
	Radius          2211343.21046619 // 计算的值
	LumBol          3020
	Teff            24000
	Age             0.11

	BinaryOrbit     
	{
		PeriodDays      5.7805
		Eccentricity    0.19
		Epoch           2443298.40
		ArgOfPericenter 295
		MeanAnomaly     0
	}
}

Star "13 Sco B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "13 Sco"
	Class           ""
	MassSol         1.12
}

// Object * rho Oph  ---  Double or Multiple Star  ---  OID=@2482782   (@@51029,0)  ---  coobox=16635 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
// 除以下恒星之外，Simbad还列出了本系统周围环绕的40颗K-M型小星，此处仅作为星团成员恒星处理（不额外添加）。
Remove "RHO Oph A" {ParentBody "RHO Oph"}
Remove "RHO Oph B" {ParentBody "RHO Oph"}
Barycenter "RHO Oph AB"
{
	ParentBody      "RHO Oph"
}

// Object * rho Oph A  ---  Star  ---  OID=@11633968   (@@-1,255)  ---  coobox=16635 
// Object types: Double or Multiple Star,Star 
Star "RHO Oph A/Gaia DR3 6050943410590451456/TYC 6794-549-1/uvby98 100147933/5 Oph A/ADS 10049 A/CCDM J16255-2327A/CD-23 12861A/CPD-23 6369A/CSI-23 12861 21/GC 22079/GCRV 9445/HD 147933/HR 6112/IDS 16196-2313 A/JP11 2740/PMC 90-93 6518/PPM 265516/ROT 2333/SAO 184382/SKY# 29620/UBV M 21412/ALS 15028/WDS J16256-2327A/WEB 13617/Gaia DR2 6050943406293584768/[MMG98] RX J1625.5-2326a"
{
	DateUpdated     "2024-05-29"
	ParentBody      "RHO Oph AB"
	Parallax        7.261
	AppMagn         5.05
	Class           "B1V"
	AbsMagn         -2.5
	MassSol         9.6
	RadSol          8.5
	LumBol          13000
	Teff            21900
	RotationPeriod  28.92

	BinaryOrbit     
	{
		Period          2398
		Separation      585.318738702766 // 4.25 asec
		Eccentricity    0.675
		Inclination     135.3
		AscendingNode   77.5
		Epoch           2570978.732399486936629
		ArgOfPericenter 46.1
		MeanAnomaly     0
	}
}

// Object * rho Oph B  ---  Star  ---  OID=@11608303   (@@-1,255)  ---  coobox=16635 
// Object types: Double or Multiple Star,Star,Infra-Red Source 
Star "RHO Oph B/Gaia DR3 6050943410590451328/TYC 6794-549-2/5 Oph B/ADS 10049 B/CCDM J16255-2327B/CD-23 12861B/CPD-23 6369B/CSI-23 12861 22/Elia 2-67/GC 22078/GCRV 9444/HD 147934/HR 6113/IRAS 16225-2319/ROT 2334/SAO 184381/UBV 13903/ALS 15029/WDS J16256-2327B/WEB 13618/Gaia DR2 6050943410590451328/[MMG98] RX J1625.5-2326b"
{
	DateUpdated     "2024-05-29"
	ParentBody      "RHO Oph AB"
	Parallax        5.4764
	AppMagn         6.66
	Class           "B2V"
	AbsMagn         0.35 // 计算的值
	MassSol         8
}

// Object HD 147932  ---  Rotating Variable  ---  OID=@2509785   (@@51023,2)  ---  coobox=16638 
// Object types: Rotating Variable,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "HD 147932/HIP 80474/Gaia DR3 6050945747052676352/TIC 203822414/ADS 10049 C/CCDM J16255-2327C/CD-23 12862/CPD-23 6370/GC 22080/GCRV 9446/GEN# +1.00147932/GSC 06794-00548/HIC 80474/PPM 265515/ROT 2332/SAO 184383/SKY# 29621/SRS 13567/TYC 6794-548-1/UBV M 21411/YZ 113 11475/uvby98 100147932/2MASS J16253507-2324186/SSTc2d J162535.1-232419/WDS J16256-2327C/EPIC 204165788/WEB 13616/Gaia DR2 6050945747052676352/Gaia DR1 6050945742755793408"
{
	DateUpdated     "2024-05-29"
	ParentBody      "RHO Oph"
	Parallax        8.1169
	AppMagn         7.27
	Class           "B5V"
	AbsMagn         1.82 // 计算的值
	MassSol         5

	Orbit     
	{
		SemiMajorAxis   17000      
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// Object HD 147888  ---  Double or Multiple Star  ---  OID=@2482780   (@@51028,0)  ---  coobox=16635 
// Object types: Rotating Variable,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "HD 147888/HIP 80461/Gaia DR3 6050944063425483520/** BU 1115/TIC 203822321/ADS 10049 DE/CCDM J16255-2327DE/CD-23 12860/CPD-23 6368/GC 22070/GCRV 9442/GSC 06794-00550/HGAM 2056/HIC 80461/PPM 265512/ROT 2329/SAO 184377/SKY# 29612/TYC 6794-550-1/UBV 13900/YZ 113 11472/2MASS J16252427-2327367/SSTc2d J162524.3-232737/WDS J16256-2327DE/EPIC 204151925/WEB 13609/Gaia DR2 6050944063425483520/GEN# +1.00147888"
{
	ParentBody      "RHO Oph"
	Orbit     
	{
		SemiMajorAxis   19000      
		ArgOfPericenter 252.5
		MeanAnomaly     0
	}
}

Star "HD 147888 A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "HD 147888"
	Parallax        8.0932
	AppMagn         6.74
	Class           "B3V"
	AbsMagn         1.28 // 计算的值
	MassSol         3.06

	BinaryOrbit     
	{
		Period          675.5
		Separation      124.796293896467 // 1.01 asec
		Eccentricity    0.707
		Inclination     134.8
		AscendingNode   152.7
		Epoch           2454685.616307616699487
		ArgOfPericenter 80.4
		MeanAnomaly     0
	}
}

Star "HD 147888 B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "HD 147888"
	Class           ""
	MassSol         1.97
}

// Object * 15 Oph  ---  Spectroscopic Binary  ---  OID=@2510266   (@@52045,5)  ---  coobox=16988 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "15 Oph A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "15 Oph"
	Class           "F3V"
	AbsMagn         1.58 // 计算的值
	//MassSol         // log(g) = 3.471 cm/s^2
	Teff            6533
	FeH             0.127

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.13576953
		Eccentricity    0.493603307
		Inclination     -1.2223773
		AscendingNode   0
		ArgOfPericenter 62.8601723
		MeanAnomaly     -73.3428829
	}
}

Star "15 Oph B"
{
	ParentBody      "15 Oph"
	Class           "G4.5?"
}