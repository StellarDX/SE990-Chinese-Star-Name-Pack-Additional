// Object * 29 Hya A  ---  Star  ---  OID=@11603339   (@@-1,255)  ---  coobox=14480 
// Object types: Double or Multiple Star,Star 
Star "29 Hya A/** A 1588A/HD 81728A/BD-08 2678A/CCDM J09272-0913A/WDS J09272-0913A/TYC 5460-1593-3"
{
	DateUpdated     "2024-07-28"
	ParentBody      "29 Hya"
	Class           "A0V"
	AbsMagn         0.1 // 计算的值

	BinaryOrbit     
	{
		Separation      84.5072580459977 // 0.36 asec
	}
}

// Object * 29 Hya B  ---  Star  ---  OID=@11603340   (@@-1,255)  ---  coobox=14480 
// Object types: Double or Multiple Star,Star 
Star "29 Hya B/** A 1588B/HD 81728B/BD-08 2678B/CCDM J09272-0913B/WDS J09272-0913B/TYC 5460-1593-1"
{
	ParentBody      "29 Hya"
	Class           "B9.8?"
}

// Object * 19 Hya  ---  Star  ---  OID=@1608201   (@@33628,8)  ---  coobox=14465 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
Star "19 Hya A"
{
	DateUpdated     "2024-07-28"
	ParentBody      "19 Hya"
	Class           "B9V"
	AbsMagn         -0.95 // 计算的值
	Oblateness      0

	BinaryOrbit     
	{
		Separation      266.847078925678 // 1.30 asec
	}
}

Star "19 Hya B"
{
	ParentBody      "19 Hya"
	Class           "B8.6?"
}

// Object * 21 Hya  ---  Spectroscopic Binary  ---  OID=@1620878   (@@33623,9)  ---  coobox=14380 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=45184
Remove "KW Hya A" {ParentBody "KW Hya"}
Remove "KW Hya B" {ParentBody "KW Hya"}
Barycenter "21 Hya AB"
{
	ParentBody      "21 Hya"
	BinaryOrbit     
	{
		Period          737415
		Separation      13365.8758170803 // 156.62 asec
	}
}

Barycenter "21 Hya A"
{
	ParentBody      "21 Hya AB"
	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   268.089806
		Eccentricity    0
		Inclination     1.04997265
		AscendingNode   0
		ArgOfPericenter 18.5198748
		MeanAnomaly     144.686642
	}
}

Star "21 Hya A1"
{
	DateUpdated     "2024-07-28"
	ParentBody      "21 Hya A"
	Class           "A0mA5/7-F0"
	AbsMagn         1.66
	MassSol         1.975
	RadSol          2.13
	LumBol          16.6
	Teff            8000

	BinaryOrbit // 2019A&A...632A..31G
	{
		PeriodDays      7.750468
		Separation      0.1160
		Eccentricity    0.094
		Inclination     92.50
		AscendingNode   75.76
		Epoch           2445024.421
		ArgOfPericenter 225.38
		MeanAnomaly     0
	}
}

Star "21 Hya A2"
{
	DateUpdated     "2024-07-28"
	ParentBody      "21 Hya A"
	Class           "F0V"
	AbsMagn         3.08
	MassSol         1.487
	RadSol          1.48
	LumBol          4.5
	Teff            6900
}

Star "21 Hya B"
{
	ParentBody      "21 Hya AB"
	Class           "F4.7?"
}

// Object SAO 136657  ---  Star  ---  OID=@1620875   (@@33623,6)  ---  coobox=14380 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star 
Star "SAO 136657/TYC 4891-1450-2/TYC 4891-1450-1/WISE J091220.42-070847.4/Gaia DR3 5745840719270038784/TIC 60658336/CSI-06 2842 2/GSC 04891-01450/PPM 192125/YZ 96 3582/2MASS J09122043-0708477/BDS 4973 B/CCDM J09124-0709B/IDS 09074-0644 B/WDS J09124-0709B/** HJ 807B/UCAC4 415-049297"
{
	DateUpdated     "2024-07-28"
	ParentBody      "21 Hya"
	Parallax        11.6444
	AppMagn         10.03
	Class           ""
	AbsMagn         5.36 // 计算的值
	MassSol         0.92
}

// Object * 23 Hya  ---  Spectroscopic Binary  ---  OID=@1620689   (@@33880,11)  ---  coobox=14374 
// Object types: Double or Multiple Star,Spectroscopic Binary,Red Giant Branch star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Barycenter "23 Hya A"
{
	ParentBody      "23 Hya"
	BinaryOrbit     
	{
		Period          725.141
		Separation      149.287308935108 // 1.4 asec
	}
}

Star "23 Hya Aa"
{
	DateUpdated     "2024-07-28"
	ParentBody      "23 Hya A"
	Class           "K2III"
	AbsMagn         0.0905 // 计算的值
	MassKg          7.39814903515698e+30 // log(g) = 2.01 cm/s^2
	RadSol          31.57493 // Gaia DR3
	LumBol          471.663404064892 // 计算的值
	Teff            4787
	FeH             -0.035

	BinaryOrbit // VB6_HIP1997d KUI_40 Gr.9
	{
		Period          2.5244
		Separation      1.1802566885782 // 0.011 asec
		Eccentricity    0.293
		Inclination     92.6
		AscendingNode   282.8
		Epoch           2448797.912063267081976
		ArgOfPericenter 272.3
		MeanAnomaly     0
	}
}

Star "23 Hya Ab"
{
	DateUpdated     "2024-07-28"
	ParentBody      "23 Hya A"
	Class           ""
	MassSol         1.40
}

Star "23 Hya B"
{
	DateUpdated     "2024-07-28"
	ParentBody      "23 Hya"
	Class           ""
	MassSol         0.84
}

// Object * gam Sex A  ---  High Proper Motion Star  ---  OID=@14869705   (@@-1,255)  ---  coobox=14441 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Remove "GAM Sex A" {ParentBody "GAM Sex"}
Remove "GAM Sex B" {ParentBody "GAM Sex"}
Star "GAM Sex A/TYC 5475-1379-1/CCDM J09525-0806A/** AC 5A/ADS 7555 A/BD-07 2909A/CSI-07 2909 3/WDS J09525-0806A"
{
	DateUpdated     "2024-07-28"
	ParentBody      "HIP 48437"
	Class           "A1V"
	AbsMagn         0.43
	MassSol         2.60
	Radius          1812789.9046706 // 计算的值
	LumBol          57
	Teff            9825
	Age             0.401

	BinaryOrbit     
	{
		Period          77.55
		Separation      32.5956518295404 // 0.383 asec
		Eccentricity    0.691
		Inclination     145.1
		AscendingNode   31.0
		ArgOfPericenter 321.5
		MeanAnomaly     0
	}
}

// Object * gam Sex B  ---  High Proper Motion Star  ---  OID=@11618833   (@@-1,255)  ---  coobox=14441 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "GAM Sex B/ADS 7555 B/CSI-07 2909 4/WDS J09525-0806B/CCDM J09525-0806B/** AC 5B/TYC 5475-1379-2"
{
	DateUpdated     "2024-07-28"
	ParentBody      "HIP 48437"
	Class           "A4V"
}

// Object * 37 Hya  ---  Double or Multiple Star  ---  OID=@1648122   (@@34434,11)  ---  coobox=14487 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=47427
Barycenter "37 Hya A"
{
	ParentBody      "37 Hya"
	BinaryOrbit     
	{
		Period          628.258
		Separation      120.409322299051 // 0.36 asec
	}
}

Star "37 Hya Aa"
{
	DateUpdated     "2024-07-28"
	ParentBody      "37 Hya A"
	Class           "A0V"
	AbsMagn         -1.3 // 计算的值
	MassSol         7.62
	RadSol          5.85 // Gaia DR3
	LumBol          413.136000142811 // 计算的值
	Teff            10759
	FeH             0.376

	BinaryOrbit     
	{
		PeriodDays      5.758
		Separation      0.09264833768145026423172118536357 // 0.277 mas
	}
}

Star "37 Hya Ab"
{
	ParentBody      "37 Hya A"
	Class           "B9.6?"
}

Star "37 Hya B"
{
	DateUpdated     "2024-07-28"
	ParentBody      "37 Hya"
	Class           ""
	MassSol         2.90
}
