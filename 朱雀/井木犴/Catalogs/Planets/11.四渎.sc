// Object * 15 Mon  ---  Be Star  ---  OID=@903759   (@@18674,0)  ---  coobox=5781 
// Object types: Irregular Variable,Be Star,Spectroscopic Binary,Young Stellar Object,Young Stellar Object,Spectroscopic Binary,Spectroscopic Binary,Young Stellar Object,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Spectroscopic Binary,Emission-line Star,Variable Star,Double or Multiple Star,Star,UV-emission Source,X-ray Source,beta Cep Variable Candidate 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=47839
// C(Cl* NGC 2264 VAS 90, B8V, 2.27 MSun)仅为星团成员，与AB无联系
Remove "S Mon A"{ParentBody "S Mon"}
Remove "S Mon B"{ParentBody "S Mon"}
Barycenter "15 Mon A"
{
	ParentBody      "HIP 31978"
	BinaryOrbit     
	{
		Period          17015
		Separation      830.985647133889 // 2.95 asec
	}
}

Star "15 Mon Aa"
{
	DateUpdated     "2024-07-19"
	ParentBody      "15 Mon A"
	Class           "O7V((f))zvar"
	AbsMagn         -5.21
	MassSol         29.1
	RadSol          9.9
	LumBol          214000
	Teff            38500

	BinaryOrbit // 2019A&A...630A.119M
	{
		Period          104.5
		Separation      30.9978141211346 // 0.11 asec
		Eccentricity    0.764
		Inclination     47.3
		AscendingNode   60.2
		Epoch           2450105.479134902823716
		ArgOfPericenter 62.9
		MeanAnomaly     0
	}
}

Star "15 Mon Ab"
{
	DateUpdated     "2024-07-19"
	ParentBody      "15 Mon A"
	Class           "O9.5Vn"
	MassSol         21.3
	Age             0.0031
}

// Object * 15 Mon B  ---  Star  ---  OID=@903179   (@@18640,4)  ---  coobox=5781 
// Object types: Young Stellar Object,Double or Multiple Star,Star 
Star "15 Mon B/Gaia DR3 3326740865571935232/ADS 5322 B/BD+10 1220B/CSI+10 1220 9/GCRV 4335/WDS J06410+0954B/S Mon B/TYC 750-1880-2/PMSC 06355+0959B/GOS G202.94+02.20 02/WEB 6443/Gaia DR2 3326740861276259712/MPCM J064058.55+095342.2"
{
	DateUpdated     "2024-07-19"
	ParentBody      "HIP 31978"
	Parallax        1.4019
	AppMagn         7.83
	Class           "B2V"
	AbsMagn         -1.44 // 计算的值
	MassSol         7.31
}

// Object * 16 Mon  ---  Spectroscopic Binary  ---  OID=@922252   (@@18666,19)  ---  coobox=5826 
// Object types: Pulsating Variable,Pulsating Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "16 Mon A"
{
	DateUpdated     "2024-07-19"
	ParentBody      "16 Mon"
	Class           "B3V"
	AbsMagn         -1.47 // 计算的值
	MassKg          1.07604502301936e+31 // log(g) = 3.791 cm/s^2
	RadSol          4.9 // Gaia DR3
	LumBol          1191.88482013604 // 计算的值
	Teff            15321
	FeH             0.734

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.22767293
		Eccentricity    0.18306467
		Inclination     2.0502792
		AscendingNode   0
		ArgOfPericenter 9.91025118
		MeanAnomaly     55.8917919
	}
}

Star "16 Mon B"
{
	ParentBody      "16 Mon"
	Class           "A1.5?"
}

// Object HD 46223  ---  Young Stellar Object  ---  OID=@890797   (@@17986,0)  ---  coobox=5809 
// Object types: Young Stellar Object,Mid-IR Source (3 to 30 µm),Young Stellar Object,Double or Multiple Star,Emission-line Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,Young Stellar Object Candidate 
Star "HD 46223 A"
{
	DateUpdated     "2024-07-19"
	ParentBody      "HD 46223"
	Class           "O4V((f))"
	AbsMagn         -5 // 计算的值 (+1.5)

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.403976365
		Eccentricity    0.872620263
		Inclination     2.07596216
		AscendingNode   0
		ArgOfPericenter 168.654
		MeanAnomaly     -152.602836
	}
}

Star "HD 46223 B"
{
	ParentBody      "HD 46223"
	Class           "B3.5?"
}