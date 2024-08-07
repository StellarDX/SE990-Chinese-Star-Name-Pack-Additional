// Object * chi Gem  ---  Spectroscopic Binary  ---  OID=@1021589   (@@21781,7)  ---  coobox=5523 
// Object types: Spectroscopic Binary,High Proper Motion Star,Red Giant Branch star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "CHI Gem A" {ParentBody "CHI Gem"}
Remove "CHI Gem B" {ParentBody "CHI Gem"}
Star "CHI Gem A"
{
	DateUpdated     "2024-07-24"
	ParentBody      "HIP 39424"
	Class           "K1IIIb"
	AbsMagn         0.461
	MassSol         1.83
	RadSol          14
	LumBol          79
	Teff            4560
	FeH             0.03
	Age             1.92

	BinaryOrbit     
	{
		PeriodDays      2437.8
		Eccentricity    0.06
		Epoch           2442894.5
		ArgOfPericenter 84
		MeanAnomaly     0
	}
}

Star "CHI Gem B"
{
	ParentBody      "HIP 39424"
	Class           "A7.2?"
}

// Object * chi Cnc  ---  High Proper Motion Star  ---  OID=@1062204   (@@21806,2)  ---  coobox=5570 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "CHI Cnc A"
{
	DateUpdated     "2024-07-24"
	ParentBody      "CHI Cnc"
	Class           "F6V"
	AbsMagn         3.85
	MassSol         1.070
	RadSol          1.3870
	LumBol          2.4378
	Teff            6130
	FeH             -0.26 
	Age             5.8

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.46467339
		Eccentricity    0.456959142
		Inclination     -0.70390749
		AscendingNode   0
		ArgOfPericenter -7.06810774
		MeanAnomaly     137.060235
	}
}

Star "CHI Cnc B"
{
	ParentBody      "CHI Cnc"
	Class           "G7.7?"
}

// Object * phi02 Cnc A  ---  Star  ---  OID=@5549423   (@@-1,255)  ---  coobox=5572 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "PHI2 Cnc A/Gaia DR3 680022210631907456/TIC 3576220/23 Cnc A/ADS 6815 A/BD+27 1612A/CCDM J08268+2656A/CSI+27 1612 1/TYC 1944-2323-1/WDS J08268+2656A/2MASS J08264708+2656076/WISE J082647.06+265607.9/Gaia DR2 680022210631907456/WEB 8011/GC 11520/ROT 1336/HD 71151/HR 3311/SAO 80188/GCRV 5571"
{
	DateUpdated     "2024-07-24"
	ParentBody      "PHI2 Cnc"
	Parallax        9.4528
	AppMagn         6.13
	Class           "A6IV"
	AbsMagn         2.65
	MassKg          3.60894287719949e+30 // log(g) = 3.688 cm/s^2
	RadSol          3.195 // Gaia DR3
	LumBol          9.1
	Teff            7758
	FeH             -0.515 // -0.04

	BinaryOrbit     
	{
		Separation      437.869752548729 // 5.18 asec
	}
}

// Object * phi02 Cnc B  ---  Star  ---  OID=@1089028   (@@21808,0)  ---  coobox=5572 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "PHI2 Cnc B/Gaia DR3 680022210631907840/TIC 3576222/23 Cnc B/ADS 6815 B/BD+27 1612B/CCDM J08268+2656B/CSI+27 1612 2/GC 11519/GCRV 5570/HD 71150/HR 3310/ROT 1335/SAO 80187/WDS J08268+2656B/TYC 1944-2324-1/GSC 01944-02324/WEB 8010/UCAC4 585-042596/Gaia DR2 680022210631907840/WISE J082646.80+265603.8/2MASS J08264684+2656036"
{
	DateUpdated     "2024-07-24"
	ParentBody      "PHI2 Cnc"
	Parallax        9.3703
	AppMagn         6.19
	Class           "A3V"
	AbsMagn         1.05 // 计算的值
	MassKg          5.38863808936836e+30 // log(g) = 4.069 cm/s^2
	RadSol          2.517795 // Gaia DR3
	LumBol          64.081625850627 // 计算的值
	Teff            10292
	FeH             0.277
}

// Object * 24 Cnc A  ---  High Proper Motion Star  ---  OID=@5612723   (@@-1,255)  ---  coobox=5580 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=41389
Remove "24 Cnc A" {ParentBody "24 Cnc"}
Remove "24 Cnc BC" {ParentBody "24 Cnc"}
Star "24 Cnc A/Gaia DR3 678725508467083008/WISEA J082639.74+243201.9/TIC 97599181/ADS 6811 A/CCDM J08267+2432A/TYC 1941-1568-1/WDS J08267+2432A/PMSC 08207+2451A/UCAC4 573-044347/2MASS J08263979+2432032/WISE J082639.74+243202.1/HD 71152/HR 3312/GC 11517/SAO 80184/GCRV 5567/WEB 8005/UBV 8046/Gaia DR2 678725508467083008"
{
	DateUpdated     "2024-07-24"
	ParentBody      "HIP 41389"
	Parallax        14.4288
	AppMagn         6.89
	Class           "F0V"
	AbsMagn         2.69 // 计算的值
	MassSol         1.5
	RadSol          1.6
	LumBol          6.3
	Teff            7331
	FeH             -0.49
	Age             0.770
}

// Object * 24 Cnc B  ---  Double or Multiple Star  ---  OID=@11617171   (@@-1,255)  ---  coobox=5580 
// Object types: High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,X-ray Source 
Barycenter "24 Cnc BC/Gaia DR3 678725508467082752/GEN# +1.00071153/WISEA J082640.07+243205.7/TIC 97599183/TYC 1941-1568-2/WEB 8006/ADS 6811 BC/CCDM J08267+2432BC/CSI+25 1920 1/GC 11518/GCRV 5568/HD 71153/HR 3313/IDS 08207+2452 BC/RBS 700/SAO 80185/UBV 8047/2MASS J08264012+2432069/1RXS J082639.2+243226/RX J0826.6+2432/WDS J08267+2432BC/** A 1746BC/UCAC4 573-044349/WISE J082640.07+243205.7/Gaia DR2 678725508467082752"
{
	ParentBody      "HIP 41389"
	BinaryOrbit     
	{
		Separation      452.153087132546 // 5.67 asec
	}
}

Star "24 Cnc B"
{
	DateUpdated     "2024-07-24"
	ParentBody      "24 Cnc BC"
	Parallax        13.4375
	AppMagn         7.471
	Class           "F7V"
	AbsMagn         3.11 // 计算的值
	MassSol         1.09

	BinaryOrbit // VB6_Doc2009g A_1746BC Gr.1
	{
		Period          21.78
		Separation      11.0892497921121 // 0.149 asec
		Eccentricity    0.079
		Inclination     19.1
		AscendingNode   153.6
		Epoch           2450967.450724026188254
		ArgOfPericenter 51
		MeanAnomaly     0
	}
}

Star "24 Cnc C"
{
	DateUpdated     "2024-07-24"
	ParentBody      "24 Cnc BC"
	Class           ""
	MassSol         1.09
}

// Object * 28 Cnc  ---  delta Sct Variable  ---  OID=@1089445   (@@20994,12)  ---  coobox=5582 
// Object types: delta Sct Variable,delta Sct Variable,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source 
Star "28 Cnc A"
{
	DateUpdated     "2024-07-24"
	ParentBody      "28 Cnc"
	Class           "F0Vn"
	AbsMagn         0.41
	MassSol         2.36
	RadSol          3.7
	LumBol          44
	Teff            7516
	FeH             0.16
	Age             0.737

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.22753575
		Eccentricity    0.585159831
		Inclination     -0.669480562
		AscendingNode   0
		ArgOfPericenter 123.04063
		MeanAnomaly     -171.335776
	}
}

Star "28 Cnc B"
{
	ParentBody      "28 Cnc"
	Class           "M6.3?"
}
