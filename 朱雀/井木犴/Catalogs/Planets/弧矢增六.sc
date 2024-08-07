// Stars in Tau Canis Majoris Cluster
// Wikipedia: https://en.wikipedia.org/wiki/Tau_Canis_Majoris
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=35415

Remove "TAU Cma (ABC)"{ParentBody "TAU Cma"}
Remove "TAU Cma D"{ParentBody "TAU Cma"}
Remove "TAU Cma (AB)"{ParentBody "TAU Cma (ABC)"}
Remove "TAU Cma C"{ParentBody "TAU Cma (ABC)"}
Remove "TAU Cma A"{ParentBody "TAU Cma (AB)"}
Remove "TAU Cma B"{ParentBody "TAU Cma (AB)"}

// ----------A's Component---------- //

// Object * tau CMa  ---  Spectroscopic Binary  ---  OID=@963187   (@@13769,0)  ---  coobox=7769 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Young Stellar Object,Eclipsing Binary,Spectroscopic Binary,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "TAU CMa A"
{
	ParentBody      "TAU CMa"
}

Barycenter "TAU CMa Aa"
{
	ParentBody      "TAU CMa A"
	BinaryOrbit     
	{
		PeriodDays      154.9168
		Separation      223.528416482105 // 0.151 asec
		Eccentricity    0.285
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2443632.398
		ArgOfPericenter 261
		MeanAnomaly     0
	}
}

Star "TAU CMa Aa1"
{
	DateUpdated     "2024-07-21"
	ParentBody      "TAU CMa Aa"
	Class           "O9II"
	AbsMagn         -5.9
	MassSol         50
	RadSol          19.8
	LumBol          280000
	Teff            32000
	Oblateness      0

	BinaryOrbit
	{
		// 已知
		PeriodDays      154.9
		Separation      6.29470233908375 // 2.736 mas
		 // 生成
		Eccentricity    0
		Inclination     1.17014527
		AscendingNode   0
		ArgOfPericenter 78.8030513
		MeanAnomaly     62.2555947
	}
}

Star "TAU CMa Aa2(?)"
{
	DateUpdated     "2024-07-21"
	ParentBody      "TAU CMa Aa"
	Class           "O9III" // ?
	AbsMagn         -5 // ?
	MassSol         35.6
	Oblateness      0
}

Barycenter "TAU CMa Ab"
{
	ParentBody      "TAU CMa A"
}

Star "TAU CMa Ab1"
{
	DateUpdated     "2024-07-21"
	ParentBody      "TAU CMa Ab"
	Class           "B0.5V"
	AbsMagn         -3.6
	MassSol         17.8
	Oblateness      0

	BinaryOrbit     
	{
		/// 已知
		PeriodDays      1.282122
		Separation      0.12432 // 0.084 mas
		// 生成
		Eccentricity    0
		Inclination     -1.46059942
		AscendingNode   0
		ArgOfPericenter 172.953415
		MeanAnomaly     -61.4923008
	}
}

Star "TAU CMa Ab2"
{
	DateUpdated     "2024-07-21"
	ParentBody      "TAU CMa Ab"
	Class           "B0.5V"
	AbsMagn         -3.6
	MassSol         17.8
	Oblateness      0
}

// --------------------------------- //

// Object 2MASS J07184309-2457156  ---  Star  ---  OID=@11680845   (@@-1,255)  ---  coobox=7769 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "2MASS J07184309-2457156/Gaia DR3 5616537013682342016/TIC 106347932/TYC 6541-4233-1/CCDM J07187-2457B/GSC 06541-04233/NGC 2362 23b/WDS J07187-2457B/** HJ 3948B/Gaia DR2 5616537013682342016"
{
	DateUpdated     "2024-07-21"
	ParentBody      "TAU CMa"
	Class           ""
	//MassSol         // log(g) = 4.002 cm/s^2
	Teff            15912
	FeH             -0.491
	Oblateness      0

	Orbit // 生成
	{
		SemiMajorAxis   12343.2002636259 // 8.34 asec
		Eccentricity    0.300311395
		Inclination     130.008237
		AscendingNode   238.042189
		ArgOfPericenter 352.953415
		MeanAnomaly     116.507699
	}
}

// Object 2MASS J07184354-2457128  ---  Young Stellar Object  ---  OID=@963194   (@@13770,10)  ---  coobox=7769 
// Object types: Young Stellar Object,Young Stellar Object,Near-IR Source (λ < 3 µm),Double or Multiple Star,Young Stellar Object,Star,X-ray Source 
Star "2MASS J07184354-2457128/Gaia DR3 5616537017986489984/TIC 106347935/CCDM J07187-2457C/NGC 2362 23c/Cl* NGC 2362 DH 136/WDS J07187-2457C/Cl* NGC 2362 DGA 3356/** HJ 3948C/Gaia DR2 5616537017986489984/CXOU J071843.5-245712/MPCM J071843.52-245712.8"
{
	DateUpdated     "2024-07-21"
	ParentBody      "TAU CMa"
	Parallax        0.5763
	AppMagn         10.42
	Class           ""
	AbsMagn         -0.777 // 计算的值
	//MassSol         // log(g) = 3.598 cm/s^2
	Teff            10000
	FeH             -0.97
	Oblateness      0

	Orbit     
	{
		SemiMajorAxis   21504.4002605931 /// 14.53 asec
		Eccentricity    0.202841941
		Inclination     175.536182
		AscendingNode   236.78116
		ArgOfPericenter 259.465427
		MeanAnomaly     281.772104
	}
}

// Object CD-24 5180  ---  Young Stellar Object  ---  OID=@978585   (@@13754,12)  ---  coobox=7772 
// Object types: Young Stellar Object,Young Stellar Object,Young Stellar Object,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,X-ray Source 
Star "CD-24 5180/Gaia DR3 5616531142471195264/TIC 106407864/2MASS J07184853-2456559/CCDM J07187-2457D/CPD-24 2228/GEN# +2.23620030/NGC 2362 30/UBV M 32436/UCAC2 21709854/YZ 114 4738/uvby98 223620030/Cl* NGC 2362 DH 301/ALS 18060/WDS J07187-2457D/** HJ 3948D/GCRV 4844/WEB 7069/CXOU J071848.5-245655/MPCM J071848.53-245655.9/SSTGLMA G238.1867-05.5201"
{
	DateUpdated     "2024-07-21"
	ParentBody      "TAU CMa"
	Parallax        0.7703
	AppMagn         8.21
	Class           ""
	AbsMagn         -2.36 // 计算的值
	MassKg          1.71584000129592e+31 // log(g) = 3.495 cm/s^2
	RadSol          8.7 // Gaia DR3
	LumBol          10891.0627467833 // 计算的值
	Teff            19991
	FeH             0.558
	Oblateness      0

	Orbit     
	{
		SemiMajorAxis   125222.799011817 // 84.61 asec
		Eccentricity    0.413542902
		Inclination     37.4060946
		AscendingNode   148.160789
		ArgOfPericenter 142.119143
		MeanAnomaly     105.194543
	}
}

Star "TAU CMa E"
{
	DateUpdated     "2024-07-21"
	ParentBody      "TAU CMa"
	Class           "B2"
	MassSol         4.89

	Orbit
	{
		SemiMajorAxis   1383.80408903874 // 0.935 asec
		Eccentricity    0.55826094
		Inclination     289.980758
		AscendingNode   0.549252788
		ArgOfPericenter 55.7384452
		MeanAnomaly     302.148667
	}
}