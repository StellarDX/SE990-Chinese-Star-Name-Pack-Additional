// Object * 48 Aur  ---  Classical Cepheid Variable  ---  OID=@885492   (@@21325,0)  ---  coobox=5273 
// Object types: Classical Cepheid Variable,Mid-IR Source (3 to 30 µm),Classical Cepheid Variable,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "48 Aur A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "48 Aur"
	Class           "F5.5Ib"
	AbsMagn         -3.09
	MassSol         4.4
	RadSol          35.1
	LumBol          1186
	Teff            6151
	FeH             0.1
	Age             0.085

	BinaryOrbit     
	{
		Separation      1.1568335812262 // 2.1 mas
	}
}

Star "48 Aur B"
{
	DateUpdated     "2024-07-11"
	ParentBody      "48 Aur"
	Class           "F0V" // CHARA
}

// Object * 53 Aur  ---  Double or Multiple Star  ---  OID=@900183   (@@21328,6)  ---  coobox=5278 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "53 Aur A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "53 Aur"
	Class           "B9Mn"
	AbsMagn         0.48
	MassSol         2.49
	Radius          1817866.79515552 // log(g) = 4.0 cm/s^2
	LumBol          82.15001413486749 // 计算的值
	Teff            10750

	BinaryOrbit     
	{
		Period          38.90
		Separation      19.2172143903658 // 0.159 asec
		Eccentricity    0.557
		Inclination     119.5
		AscendingNode   113.5
		Epoch           2443045.347432466223836
		ArgOfPericenter 163.3
		MeanAnomaly     0
	}
}

Star "53 Aur B"
{
	DateUpdated     "2024-07-11"
	ParentBody      "53 Aur"
	Class           "F0m"
	Teff            7250
}

// Object * 54 Aur A  ---  Star  ---  OID=@15318639   (@@-1,255)  ---  coobox=5279 
// Object types: Double or Multiple Star,Star 
Barycenter "54 Aur A/Gaia DR3 3386123083403623168/TYC 1892-778-1/CCDM J06396+2816A/** STT 152A/ADS 5289 A/HD 47395A/WDS J06396+2816A/Gaia DR2 3386123083403623168"
{
	ParentBody      "54 Aur"
	BinaryOrbit     
	{
		Separation      224.807144619272 // 0.87 asec
	}
}

Star "54 Aur Aa"
{
	DateUpdated     "2024-07-11"
	ParentBody      "54 Aur A"
	Parallax        3.5961
	AppMagn         6.22
	Class           "B7III"
	AbsMagn         -1 // 计算的值
	Radius          3351608.60520793 // 计算的值
	LumBol          315.49
	Teff            11083

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.58961504
		Eccentricity    0.571925426
		Inclination     0.739638567
		AscendingNode   0
		ArgOfPericenter 9.72329468
		MeanAnomaly     93.2036255
	}
}

Star "54 Aur Ab"
{
	ParentBody      "54 Aur A"
	Class           "B9.2?"
}

// Object * 54 Aur B  ---  Star  ---  OID=@11614331   (@@-1,255)  ---  coobox=5279 
// Object types: Double or Multiple Star,Star 
Star "54 Aur B/TIC 718985695/Gaia DR3 3386123083405937664/TYC 1892-778-2/CCDM J06396+2816B/** STT 152B/ADS 5289 B/HD 47395B/WDS J06396+2816B/Gaia DR2 3386123083405937664"
{
	DateUpdated     "2024-07-11"
	ParentBody      "54 Aur"
	Class           "DA1/K4V"
}

// Object * 30 Gem  ---  High Proper Motion Star  ---  OID=@902433   (@@18978,13)  ---  coobox=5693 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "30 Gem A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "30 Gem"
	Class           "K0IIICa1"
	AbsMagn         -0.43 // 计算的值

	BinaryOrbit     
	{
		Epoch           2455563
		Separation      2042.07442434006 // 21.20 asec
		PositionAngle   187
	}
}

Star "30 Gem B"
{
	ParentBody      "30 Gem"
	Class           "G3?"
}

// Object * e Gem  ---  High Proper Motion Star  ---  OID=@921851   (@@18991,4)  ---  coobox=5737 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,Variable Star Candidate,X-ray Source 
Star "38 Gem A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "38 Gem"
	Class           "A8V"
	AbsMagn         2.37 // 计算的值
	MassSol         1.55
	Radius          1100596.7664077 // log(g) = 4.23 cm/s^2
	LumBol          6.797965692444776 // 计算的值
	Teff            7410
	FeH             -0.08
	Age             1.179

	BinaryOrbit     
	{
		Period          1943.8 // 3190
		Separation      184.3
		Eccentricity    0.150 // 0.485
	}
}

// Object * e Gem B  ---  High Proper Motion Star  ---  OID=@921852   (@@18991,5)  ---  coobox=5737 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "e Gem B/GJ 9220 B/Gaia DR3 3353254695123859456/TIC 155463741/ADS 5559 B/BD+13 1462B/CSI+13 1462 4/GCRV 4515/GEN# +1.00050635B/HD 50635B/UBV 6820/WDS J06546+1311B/** STF 982B/CCDM J06546+1311B/TYC 760-2586-2/UCAC4 516-034759/2MASS J06543891+1310343/WEB 6677/Gaia DR2 3353254695123859456"
{
	DateUpdated     "2024-07-11"
	ParentBody      "38 Gem"
	Parallax        33.3248
	AppMagn         9.05
	Class           "G4V"
	AbsMagn         6.66 // 计算的值
	MassSol         0.89
	RadSol          0.89
	LumBol          0.694
	Teff            5583
}

// Object HD 55283A  ---  Star  ---  OID=@23396668   (@@-1,255)  ---  coobox=5744 
// Object types: Star 
Star "HD 55283A/Gaia DR3 3167685650936166528/TYC 1346-760-1"
{
	DateUpdated     "2024-07-11"
	ParentBody      "HD 55283"
	Parallax        2.7841
	AppMagn         7.7 // Stellarium
	Class           "A0"
	AbsMagn         -0.0766 // 计算的值
	MassSol         2.1723475310591 // log(g) = 3.762 cm/s^2
	RadSol          3.21 // Gaia DR3
	LumBol          92.3145144923295 // 计算的值
	Teff            9986
	FeH             -0.49

	BinaryOrbit     
	{
		Separation      2905.40576682535 // 2.15 asec
	}
}

// Object HD 55283B  ---  Star  ---  OID=@6541895   (@@-1,255)  ---  coobox=5744 
// Object types: Star 
Star "HD 55283B/Gaia DR3 3167685646641034368/TYC 1346-760-2"
{
	ParentBody      "HD 55283"
	Class           "F6.2?"
}