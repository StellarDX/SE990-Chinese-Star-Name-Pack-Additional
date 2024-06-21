// Object * pi. Cas  ---  Spectroscopic Binary  ---  OID=@7754   (@@3987,4)  ---  coobox=2091 
// Object types: Ellipsoidal Variable,Spectroscopic Binary,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "PI Cas A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "PI Cas"
	Class           "A5V"
	AbsMagn         1.30
	MassSol         1.82
	RadSol          1.9
	LumBol          22
	Teff            8392
	Age             0.251

	BinaryOrbit     
	{
		PeriodDays      1.9642
		Eccentricity    0.00
		Epoch           2427535.74
		ArgOfPericenter 180.00
		MeanAnomaly     0
	}
}

Star "PI Cas B"
{
	DateUpdated     "2024-06-21"
	ParentBody      "PI Cas"
	Class           "A5V"
	MassSol         1.87
	RadSol          1.9
}

// Object * ksi Cas  ---  Spectroscopic Binary  ---  OID=@45736   (@@4381,0)  ---  coobox=2104 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "KSI Cas A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "KSI Cas"
	Class           "B2V"
	AbsMagn         -3.52 // -0.42
	MassSol         10.1
	RadSol          4.5
	LumBol          2873
	Teff            15585
	Age             0.019

	BinaryOrbit     
	{
		PeriodDays      940.2
		Eccentricity    0.4
		Epoch           2441738
		ArgOfPericenter 299
		MeanAnomaly     0
	}
}

Star "KSI Cas B"
{
	ParentBody      "KSI Cas"
	Class           "B5.9?"
}

// Object * phi Cas  ---  Yellow Supergiant  ---  OID=@134230   (@@3617,0)  ---  coobox=2244 
// Object types: Yellow Supergiant,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source 
Star "PHI Cas/HIP 6242/Gaia DR3 413828761929696256/TIC 332680754/2MASS J01200492+5813537/Cl* NGC 457 MMU 136/PLX 271/Cl* NGC 457 ALT 172/Cl* NGC 457 ESY 59/Cl* NGC 457 HOAG 1/34 Cas/ADS 1073 A/AG+57 146/ALS 6537/BD+57 260/CCDM J01200+5813A/CSI+57 260 1/GC 1594/GCRV 762/GEN# +2.04570136/GSC 03682-02389/HD 7927/HD 7927A/HIC 6242/HR 382/IDS 01138+5742 A/IRAS 01169+5758/IRC +60046/JP11 3890/LS I +57 17/MCW 64/N30 270/NGC 457 136/PPM 26234/ROT 195/SAO 22191/SKY# 2011/TYC 3682-2389-1/UBV 1406/UBV M 30206/YZ 57 1130/uvby98 204570136/PLX 271.00/WDS J01201+5814A/Gaia DR1 413828757625180672/WEB 1396/Gaia DR2 413828761929696256ss"
{
	DateUpdated     "2024-06-21"
	ParentBody      "ADS 1073"
	Class           "F0Ia"
	AbsMagn         -8.76
	MassSol         6.3 // 17
	RadSol          263
	LumBol          170000
	Teff            7341
	FeH             -0.24
	Age             0.020
	Oblateness      0
}

// Object NGC 457 135  ---  Star  ---  OID=@3707453   (@@80694,23)  ---  coobox=2244 
// Object types: Double or Multiple Star,Star 
Star "NGC 457 135/Gaia DR3 413827280158360704/Gaia DR2 413827280158360704/WDS J01201+5814B/CSI+57 260 2/CCDM J01200+5813B/ADS 1073 B/Cl* NGC 457 ALT 162/Cl* NGC 457 PES 65/Cl* NGC 457 HG 135/Cl* NGC 457 ESY 57/GEN# +2.04570135"
{
	DateUpdated     "2024-06-21"
	ParentBody      "PHI Cas"
	Parallax        0.3829
	AppMagn         12.72
	Class           ""
	AbsMagn         0.635 // 计算的值
	MassKg          1.33286678226313e+31 // log(g) = 3.956 cm/s^2
	RadSol          4.509976 // Gaia DR3
	LumBol          1019.48488866552 // 计算的值
	Teff            15358
	FeH             -0.304
	Oblateness      0

	Orbit     
	{
		SemiMajorAxis   117515.019599482 // 48.38 asec
		ArgOfPericenter 208.7
		MeanAnomaly     0
	}
}

// Object HD 7902  ---  Blue Supergiant  ---  OID=@133953   (@@3606,6)  ---  coobox=2244 
// Object types: Blue Supergiant,Blue Supergiant,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Emission-line Star,Star,Star,Star 
// 这可能是双星
Barycenter "HD 7902/HIP 6229/Gaia DR3 413827353180436736/TIC 332499471/2MASS J01195173+5812293/Cl* NGC 457 HOAG 2/Cl* NGC 457 ALT 141/Cl* NGC 457 ESY 51/Cl* NGC 457 PES 1/ADS 1073 C/AG+57 145/ALS 6536/BD+57 257/CCDM J01200+5813C/CSV 102344/EM* MWC 424/GC 1590/GCRV 760/GEN# +2.04570131/GSC 03681-01736/HGAM 70/HIC 6229/Hilt 115/IDS 01138+5742 C/LS I +57 16/MCW 63/NGC 457 131/NSV 466/PPM 26230/ROT 3581/SAO 22187/SKY# 2005/TYC 3681-1736-1/UBV M 30204/UBV 1400/UBV 1407/YZ 57 1126/[KW97] 5-29/uvby98 204570131/WDS J01201+5814C/** H 23C/Gaia DR1 413827348875897600/WEB 1395/Gaia DR2 413827353180436736"
{
	ParentBody      "PHI Cas"
	Orbit     
	{
		SemiMajorAxis   325704.604254003 // 134.09 asec
		ArgOfPericenter 231
		MeanAnomaly     0
	}
}

Star "HD 7902 A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HD 7902"
	Parallax        0.3679
	AppMagn         6.96
	Class           "B5Ia"
	AbsMagn         -6.5
	MassSol         21
	RadSol          53
	LumBol          83000
	Teff            15500
	Oblateness      0

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.8635483
		Eccentricity    0.669809305
		Inclination     -2.27942038
		AscendingNode   0
		ArgOfPericenter -44.6080248
		MeanAnomaly     172.132056
	}
}

Star "HD 7902 B"
{
	ParentBody      "HD 7902"
	Class           "B?"
}

// Object BD+57 254  ---  Star  ---  OID=@133951   (@@3606,4)  ---  coobox=2244 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Star 
Star "BD+57 254/Gaia DR3 413874494744555136/TIC 332499331/Cl* NGC 457 HOAG 8/TYC 3681-1521-1/GSC 03681-01521/2MASS J01194332+5814484/Cl* NGC 457 HG 54/CCDM J01200+5813D/ADS 1073 D/CSI+57 260 3/IDS 01138+5742 D/Cl* NGC 457 ALT 119/Cl* NGC 457 ESY 47/ALS 6532/CSI+57-01166/LS I +57 15/GEN# +2.04570054/NGC 457 54/UBV M 30162/uvby98 204570054/ALS 17124/Cl* NGC 457 PES 25/WDS J01201+5814D/** H 23D/Gaia DR2 413874494744555136"
{
	DateUpdated     "2024-06-21"
	ParentBody      "PHI Cas"
	Parallax        0.325
	AppMagn         10.18
	Class           "B3"
	AbsMagn         -2.26 // 计算的值
	MassKg          1.5971323374255e+31 // log(g) = 3.399 cm/s^2
	RadSol          9.374569 // Gaia DR3
	LumBol          7255.9361209409 // 计算的值
	Teff            17399
	FeH             0.065
	Oblateness      0

	Orbit     
	{
		SemiMajorAxis   434572.376397766 // 178.91 asec
		ArgOfPericenter 287.8
		MeanAnomaly     0
	}
}

// Object NGC 457 100  ---  Pulsating Variable  ---  OID=@134367   (@@82374,29)  ---  coobox=2244 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Star 
Star "NGC 457 100/Gaia DR3 413827387540175360/TIC 332499478/2MASS J01194642+5812259/TYC 3681-1742-1/ADS 1073 E/CCDM J01200+5813E/CSI+57 260 4/GSC 03681-01742/Cl* NGC 457 ALT 129/GEN# +2.04570100/UBV M 30184/uvby98 204570100/ALS 17126/Cl* NGC 457 PES 34/WDS J01201+5814E/Gaia DR2 413827387540175360"
{
	DateUpdated     "2024-06-21"
	Parallax        0.3726
	AppMagn         10.61
	ParentBody      "PHI Cas"
	Class           ""
	AbsMagn         -1.53 // 计算的值
	MassKg          1.53845342747538e+31 // log(g) = 3.423 cm/s^2
	RadSol          8.95 // Gaia DR3
	LumBol          6333.81097958074 // 计算的值
	Teff            17212
	FeH             0.052

	Orbit     
	{
		SemiMajorAxis   414071.618255493 // 170.47 asec
		ArgOfPericenter 239.1
		MeanAnomaly     0
	}
}
