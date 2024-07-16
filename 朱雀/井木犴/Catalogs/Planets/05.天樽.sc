// Object * 40 Gem  ---  Double or Multiple Star  ---  OID=@936343   (@@20935,13)  ---  coobox=5350 
// Object types: Chemically Peculiar Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "40 Gem A"
{
	DateUpdated     "2024-07-16"
	ParentBody      "40 Gem"
	Class           "B8VpSi"
	AbsMagn         -0.985 // 计算的值
	MassKg          6.40304734750848e+30 // log(g) = 3.661 cm/s^2
	RadSol          4.390098 // Gaia DR3
	LumBol          501.594505499079 // 计算的值
	Teff            13037
	FeH             -1.209

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.4830512
		Eccentricity    0.35098375
		Inclination     -2.36945534
		AscendingNode   0
		ArgOfPericenter -75.7339468
		MeanAnomaly     141.68746
	}
}

Star "40 Gem B"
{
	ParentBody      "40 Gem"
	Class           "B7.7?"
}

// Object * 61 Gem  ---  Double or Multiple Star  ---  OID=@969924   (@@20126,13)  ---  coobox=5717 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "61 Gem A"
{
	DateUpdated     "2024-07-16"
	ParentBody      "61 Gem"
	Class           "F2Vn"
	AbsMagn         0.29

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   220.81878
		Eccentricity    0.17270879
		Inclination     -1.16086602
		AscendingNode   0
		ArgOfPericenter 57.6188254
		MeanAnomaly     166.893001
	}
}

Star "61 Gem B"
{
	ParentBody      "61 Gem"
	Class           "F4.8?"
}

// Object * 63 Gem  ---  Spectroscopic Binary  ---  OID=@969658   (@@20533,0)  ---  coobox=5375 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=6089
// 还有一颗D位于距离主星3.9秒处，Simnad将这颗恒星标为63 Gem B，但是2MASS没有看到这颗恒星。
// 似乎还有一颗恒星位于环绕Aa-Ab的轨道上，轨道周期46.3843年
Barycenter "63 Gem A"
{
	ParentBody      "63 Gem"
	BinaryOrbit     
	{
		Period          25592
		Separation      1393.52802898462 // 42.93 asec
	}
}

Barycenter "63 Gem Aa"
{
	ParentBody      "63 Gem A"
	BinaryOrbit // VB6_Mut2010d MCA_30Aa, Gr.2
	{
		Period          2.0810
		Separation      2.43316149617483 // 0.075 asec
		Eccentricity    0.415
		Inclination     92.3
		AscendingNode   346.9
		Epoch           2454038.041889178100973
		ArgOfPericenter 192.1
		MeanAnomaly     0
	}
}

Star "63 Gem Aa1"
{
	DateUpdated     "2024-07-16"
	ParentBody      "63 Gem Aa"
	Class           "F3V"
	AbsMagn         2.68 // 计算的值
	MassKg          2.74327912883023e+30 // log(g) = 3.808 cm/s^2
	RadSol          2.42614 // Gaia DR3
	LumBol          9.29271284608174 // 计算的值
	Teff            6470
	FeH             -0.371

	BinaryOrbit // SB9_454 1976ApJS...30..273A
	{
		PeriodDays      1.9327
		Eccentricity    0.030
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2423429.680
		ArgOfPericenter 222
		MeanAnomaly     0
	}
}

Star "63 Gem Aa2"
{
	DateUpdated     "2024-07-16"
	ParentBody      "63 Gem Aa"
	Class           ""
	MassSol         1.16
}

Star "63 Gem Ab"
{
	DateUpdated     "2024-07-16"
	ParentBody      "63 Gem A"
	Class           ""
	MassSol         0.95
}

// Object UCAC4 558-041269  ---  High Proper Motion Star  ---  OID=@969620   (@@20530,4)  ---  coobox=5375 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC4 558-041269/Gaia DR3 865209105808181504/TIC 60846087/ADS 6089 B/CCDM J07277+2127B/CSI+21 1602 2/GEN# +1.00058728B/IDS 07218+2139 B/UBV 7203/WDS J07277+2127B/** SHJ 368B/PMSC 07218+2139B/2MASS J07274254+2127179/Gaia DR2 865209105808181504"
{
	DateUpdated     "2024-07-16"
	ParentBody      "63 Gem"
	Parallax        29.416
	AppMagn         10.74
	Class           "M0"
	AbsMagn         8.08 // 计算的值
	MassSol         0.64
}
