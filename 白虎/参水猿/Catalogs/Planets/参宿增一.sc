// Sigma Orionis Open Cluster bright member star catalog
// In the central arc-minute of the cluster five particularly bright stars are visible, 
// labelled A to E in order of distance from the brightest component A.

// Orbit of these member stars except A-B system are randomly generated
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=26549

Remove "SIG Ori (AB)"{ParentBody "SIG Ori"}
Remove "SIG Ori B"{ParentBody "SIG Ori"}
Remove "SIG Ori Aa"{ParentBody "SIG Ori (AB)"}
Remove "SIG Ori Ab"{ParentBody "SIG Ori (AB)"}
Remove "SIG Ori C"{ParentBody "SIG Ori"}
Remove "SIG Ori Ca"{ParentBody "SIG Ori C"}
Remove "SIG Ori Cb"{ParentBody "SIG Ori C"}
Remove "SIG Ori D"{ParentBody "SIG Ori"}
Remove "SIG Ori E"{ParentBody "SIG Ori"}
Remove "SIG Ori Ea"{ParentBody "SIG Ori E"}
Remove "SIG Ori Eb"{ParentBody "SIG Ori E"}

// Object * sig Ori  ---  Young Stellar Object  ---  OID=@826861   (@@16993,0)  ---  coobox=6482 
// Object types: Spectroscopic Binary,Double or Multiple Star,Double or Multiple Star,Young Stellar Object,Spectroscopic Binary,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Asymptotic Giant Branch Star Candidate,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "SIG Ori/HIP 26549/WISE J053844.88-023556.7/Gaia DR3 3216486443742786048/GEN# +1.00037468/TIC 11286198/[FPS2006] NX 80/Mayrit AB/2MASS J05384476-0236001/[SSC2008] 19/PLX 1293/48 Ori/2E 1470/ADS 4241 AB/ALS 8473/BD-02 1326/CCDM J05387-0236AB/CEL 890/CGO 101/CSI-02 1326 1/GC 7031/GCRV 3488/GOS G206.82-17.34 01/GSC 04771-01196/HD 37468/HGAM 463/HIC 26549/HR 1931/IRAS 0536-026P10/JP11 1205/LS VI -02 1/MCW 345/N30 1211/NSV 16610/PPM 188303/RAFGL 5159/ROT 896/SAO 132406/SKY# 9178/TYC 4771-1196-1/UBV M 11305/UBV 5696/WH 415/YPAC 389/[SC93b] 356/uvby98 100037468 ABV/2E 0536.2-0237/EUVE J0538-02.5/[KSP2003] J053844.77-023559.1/UCAC3 175-24559/WDS J05387-0236AB/[W96] rJ053845-0236/CSI-02 1326 6/** BU 1032/UCAC4 437-010887/CSI-02 1326 5/CSI-02 1326 4/UBV 5698/** STF 762AB/IRAS 05362-0237/WEB 5232/Gaia DR2 3216486439446556544"
{
	ParentBody "sigma Orionis Central System"
}

Barycenter "SIG Ori A"
{
	ParentBody      "HIP 26549"
	BinaryOrbit // VB6_NOI2016b BU_1032AB Gr.2 (Combined)
	{
		PeriodDays      58402
		Separation      104.89465611384 // 0.2629 asec
		Eccentricity    0.024
		Inclination     172.1
		AscendingNode   301.6
		Epoch           2451255
		ArgOfPericenter 7.4
		MeanAnomaly     0
	}
}

Star "SIG Ori Aa"
{
	DateUpdated     "2024-07-06"
	ParentBody      "SIG Ori A"
	Class           "O9.5V"
	AbsMagn         -3.49
	MassSol         18
	RadSol          5.6
	LumBol          41700
	Teff            35000
	Age             0.0003

	BinaryOrbit // 2016AJ....152..213S (Simultaneous Visual and Spectroscopic Fit)
	{
		PeriodDays      143.2002
		SemiMajorAxisKm 235418516.65431 // 4.2860 mas (~360 RSun)
		Eccentricity    0.77896
		Inclination     56.378
		AscendingNode   6.878
		Epoch           2456597.638
		ArgOfPericenter 199.83
		MeanAnomaly     0
	}
}

Star "SIG Ori Ab"
{
	DateUpdated     "2024-07-06"
	ParentBody      "SIG Ori A"
	Class           ""
	AbsMagn         -2.90
	MassSol         13
	RadSol          4.8
	LumBol          18600
	Teff            31000
	Age             0.0009
}

Star "SIG Ori B"
{
	DateUpdated     "2024-07-06"
	ParentBody      "HIP 26549"
	Class           "B0.2V(n)"
	AbsMagn         -2.79
	MassSol         14
	RadSol          5.0
	LumBol          15800
	Teff            29000
	Age             0.0019
}

// Object * sig Ori C  ---  Young Stellar Object Candidate  ---  OID=@826862   (@@16994,1)  ---  coobox=6482 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Young Stellar Object Candidate 
Barycenter "SIG Ori C/Gaia DR3 3216486439450208000/TIC 11286194/Mayrit 11238/[BHM2009] SigOri-MAD-3/ADS 4241 C/BD-02 1326C/CCDM J05387-0236C/CSI-02 1326 3/GEN# +1.00037468C/IDS 05337-0239 C/UBV 5697/WDS J05387-0236C/2MASS J05384411-0236062/** STF 762C/PMSC 05337-0239C/PPMX J053844.1-023606/DENIS J053844.1-023606/Gaia DR2 3216486439450208000"
{
	ParentBody      "sigma Orionis Central System"
	Orbit     
	{
		SemiMajorAxis   3960
		Eccentricity    0.303780825
		Inclination     129.59923
		AscendingNode   264.852925
		ArgOfPericenter 221.801596
		MeanAnomaly     173.129771
	}
}

Star "SIG Ori Ca"
{
	DateUpdated     "2024-07-06"
	ParentBody      "Gaia DR3 3216486439450208000"
	Parallax        2.472
	AppMagn         8.79
	Class           "A2Vn"
	AbsMagn         0.76 // 计算的值
	MassSol         2.7

	BinaryOrbit     
	{
		SemiMajorAxis   770.071036329282 // 1.93 asec
		Eccentricity    0.0860472298
		Inclination     -1.00447607
		AscendingNode   0
		ArgOfPericenter 91.0866892
		MeanAnomaly     66.5978139
	}
}

// Object [BHM2009] SigOri-MAD-4  ---  Star  ---  OID=@4946787   (@@-1,255)  ---  coobox=6482 
// Object types: Near-IR Source (λ < 3 µm),Star 
Star "[BHM2009] SigOri-MAD-4"
{
	DateUpdated     "2024-07-06"
	ParentBody      "Gaia DR3 3216486439450208000"
	Class           "L"
}

// Object * sig Ori D  ---  Young Stellar Object  ---  OID=@828328   (@@125224,14)  ---  coobox=6482 
// Object types: Young Stellar Object,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Young Stellar Object Candidate 
Star "SIG Ori D/HIP 26551/Gaia DR3 3216486478101982592/WISEA J053845.57-023558.8/TIC 11286199/Mayrit 13084/2MASS J05384561-0235588/TYC 4771-1195-1/GSC 04771-01195/ADS 4241 D/ALS 8474/BD-02 1326D/CCDM J05387-0236D/CSI-02 1326 2/GC 7032/GEN# +1.00037468D/HD 37468D/HIC 26551/LS VI -02 2/UBV 5699/WDS J05387-0236D/** STF 762D/PMSC 05337-0239D/UCAC4 438-011198/WISE J053845.62-023558.8/Gaia DR2 3216486478101982592"
{
	DateUpdated     "2024-07-06"
	ParentBody      "sigma Orionis Central System"
	Parallax        2.4744
	AppMagn         6.69
	Class           "B2V"
	AbsMagn         -1.34 // 计算的值
	MassSol         6.8
	Radius          2126751.9504629 // log(g) = 4.3 cm/s^2
	LumBol          1799.024967849191 // 计算的值
	Teff            21500

	Orbit     
	{
		SemiMajorAxis   4680
		Eccentricity    0.805838259
		Inclination     241.396885
		AscendingNode   74.1984733
		ArgOfPericenter 130.198455
		MeanAnomaly     304.038168
	}
}

// Object * sig Ori D  ---  Young Stellar Object  ---  OID=@828328   (@@125224,14)  ---  coobox=6482 
// Object types: Young Stellar Object,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Young Stellar Object Candidate 
Barycenter "SIG Ori E/AP J05384719-0235405/Gaia DR3 3216486478101981056/TIC 11286209/[FPS2006] NX 84/Mayrit 41062/2MASS J05384719-0235405/Mayrit 42062/[SSC2008] 23/TYC 4771-1194-1/GSC 04771-01194/ADS 4241 E/ALS 8475/BD-02 1327/CCDM J05387-0236E/GC 7034/GCRV 3489/GEN# +1.00037479A/HD 37479/HR 1932/LS VI -02 3/PPM 188304/SAO 132408/SKY# 9180/UBV 5703/UBV M 11312/V* V1030 Ori/WH 414/YZ 92 1712/[HHM2007] 724/1E 0536.2-0237/WDS J05387-0236E/[W96] rJ053847-0235/** STF 762E/Renson 10080/PMSC 05337-0239E/** RAS 22/WDS J05387-0236Ea,Eb/GBS-VLA J053847.19-023540.3/WEB 5234/Gaia DR2 3216486478101981056"
{
	ParentBody      "sigma Orionis Central System"
	BinaryOrbit     
	{
		SemiMajorAxis   15000
		Eccentricity    0.516382587
		Inclination     107.825193
		AscendingNode   58.6529553
		ArgOfPericenter 218.802728
		MeanAnomaly     74.1984733
	}
}

Star "SIG Ori Ea"
{
	DateUpdated     "2024-07-06"
	ParentBody      "Gaia DR3 3216486478101981056"
	Parallax        2.3077
	AppMagn         6.46
	Class           "B2IV-Vp_He"
	AbsMagn         -1.72 // 计算的值
	MassSol         8.30
	RadSol          3.77
	LumBol          3162
	Teff            22500
	RotationPeriod  28.580328
	Age             0.0004 // 0.0009

	BinaryOrbit     
	{
		SemiMajorAxis   133.001191595121 // 1/3 asec
		Eccentricity    0.889258728
		Inclination     0.535307646
		AscendingNode   0
		ArgOfPericenter -25.3919884
		MeanAnomaly     -87.2868058
	}
}

Star "SIG Ori Eb"
{
	DateUpdated     "2024-07-06"
	ParentBody      "Gaia DR3 3216486478101981056"
	Class           ""
	MassSol         0.4 // 0.8
}

// Object NAME sig Ori IRS 1  ---  Star  ---  OID=@828270   (@@123133,0)  ---  coobox=6482 
// Object types: Star,X-ray Source 
Barycenter "SIG Ori IRS 1/[SSC2008] 20/Mayrit 3020"
{
	ParentBody      "sigma Orionis Central System"
	BinaryOrbit     
	{
		SemiMajorAxis   1536.15001363512 // 3.85 asec
		Eccentricity    0.488369228
		Inclination     91.4877232
		AscendingNode   210.47518
		ArgOfPericenter 8.43062843
		MeanAnomaly     87.4908397
	}
}

Star "SIG Ori IRS 1A"
{
	ParentBody     "SIG Ori IRS 1"
	Class          "M1"
	MassSol        0.5

	BinaryOrbit
	{
		SemiMajorAxis   0.276441049
		Eccentricity    0.297261318
		Inclination     -0.215638876
		AscendingNode   0
		ArgOfPericenter -30.5192055
		MeanAnomaly     -20.4249233
	}
}

Star "SIG Ori IRS 1B"
{
	ParentBody     "SIG Ori IRS 1"
	Class          "M7-8"

	AccretionDisk
	{
		InnerRadiusKm     6.52e+04
		OuterRadiusKm     1.96e+06
		InnerThicknessKm  1.94e+04
		OuterThicknessKm  3.87e+04
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      6
		OctaveDistortionX 0.5
		OctaveDistortionY 0.35
		OctaveDistortionZ 0.2
		OctaveScale       0.5
		DiskNoiseContrast 1
		DiskTempContrast  0.15
		DiskOuterSpin     0.04
		TwistMagn         2.5e+03
		AccretionRate     2.15e-12
		Temperature       2.94e+03
		Density           1.48e-09
		Luminosity        0.00916
		LuminosityBol     0.0111
		Brightness        1
		JetLengthKm       5.81e+06
		JetStartRadiusKm  1.94e+05
		JetEndRadiusKm    4.84e+05
		JetStartTemp      2.94e+03
		JetEndTemp        2.21e+03
		JetVelocity       0.1
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        0
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}
}

// Object HD 37525  ---  Young Stellar Object  ---  OID=@826866   (@@16994,5)  ---  coobox=6482 
// Object types: Young Stellar Object,Young Stellar Object,Near-IR Source (λ < 3 µm),Star,Star,Star,Star,UV-emission Source,X-ray Source 
Star "HD 37525 A"
{
	DateUpdated     "2024-07-07"
	ParentBody      "HD 37525"
	Class           "B5V"
	AbsMagn         0.06

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   148.02591826545 // 0.45 asec
		Eccentricity    0
		Inclination     2.25811242
		AscendingNode   0
		ArgOfPericenter 123.202299
		MeanAnomaly     -138.71501
	}
}

Star "HD 37525 B"
{
	DateUpdated     "2024-07-07"
	ParentBody      "HD 37525"
	Class           "F3" // Unknown, PMS
}

// Object HD 294271  ---  Young Stellar Object  ---  OID=@826859   (@@16992,1)  ---  coobox=6482 
// Object types: Young Stellar Object,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,Star,Star 
Barycenter "HD 294271 A"
{
	ParentBody      "HD 294271"
	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.879963959
		Eccentricity    0.432077749
		Inclination     0.995345116
		AscendingNode   0
		ArgOfPericenter 12.4298012
		MeanAnomaly     79.3445382
	}
}

Star "HD 294271 Aa"
{
	DateUpdated     "2024-07-07"
	ParentBody      "HD 294271 A"
	Class           "B5V"
	AbsMagn         -0.1

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.04171652795
		Eccentricity    0
		Inclination     -1.97945499
		AscendingNode   0
		ArgOfPericenter -64.9152825
		MeanAnomaly     -95.9820669
	}
}

Star "HD 294271 Ab"
{
	DateUpdated     "2024-07-07"
	ParentBody      "HD 294271 A"
	Class           "K1" // Unknown, low-mass companion
	Teff            4011
}

Star "HD 294271 B"
{
	DateUpdated     "2024-07-07"
	ParentBody      "HD 294271"
	Class           "M3.5" // Unknown, low-mass companion
	Teff            3995
}

// Object HD 294272A  ---  Young Stellar Object  ---  OID=@3894630   (@@-1,255)  ---  coobox=6482 
// Object types: Young Stellar Object,Young Stellar Object,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Star,Star 
Star "HD 294272A/AP J05383479-0234158/Gaia DR3 3216489536118543104/TIC 11286243/ADS 4240 B/CCDM J05386-0234B/GC 7021/GEN# +1.00294272B/IDS 05335-0238 B/2MASS J05383479-0234158/BD-02 1323A/Mayrit 182305/GSC 04771-01205/TYC 4771-1205-1/[HHM2007] 601/ALS 20448/WDS J05386-0233B/** STF 761B/SAO 132400/Gaia DR1 3216489531823008256/Gaia DR2 3216489536118543104"
{
	DateUpdated     "2024-07-07"
	ParentBody      "HD 294272"
	Parallax        2.5051
	AppMagn         8.39
	Class           "B9.5III"
	AbsMagn         0.384 // 计算的值
	MassKg          3.4490294172537e+30 // log(g) = 3.839 cm/s^2
	RadSol          2.625 // Gaia DR3
	LumBol          53.6785728568872 // 计算的值
	Teff            9643
	FeH             -0.73

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   2822.36840609995 // 8.58 asec
		Eccentricity    0.323736005
		Inclination     -1.85582113
		AscendingNode   0
		ArgOfPericenter -77.0345133
		MeanAnomaly     157.465582
	}
}

// Object HD 294272B  ---  Young Stellar Object  ---  OID=@826858   (@@16992,0)  ---  coobox=6482 
// Object types: Young Stellar Object,Young Stellar Object,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Star,Star 
Star "HD 294272B/AP J05383422-0234160/Gaia DR3 3216489737981438336/TIC 11286242/TYC 4771-1204-1/GSC 04771-01204/2MASS J05383422-0234160/BD-02 1323B/Mayrit 189303/ADS 4240 C/CCDM J05386-0234C/CSI-02 1323 2/GC 7020/IDS 05335-0238 C/SAO 132399/[HHM2007] 590/WDS J05386-0233C/[W96] rJ053834-0234/** STF 761C/Gaia DR1 3216489737981438336/Gaia DR2 3216489737981438336"
{
	DateUpdated     "2024-07-07"
	ParentBody      "HD 294272"
	Parallax        2.592
	AppMagn         8.57
	Class           "B8V"
	AbsMagn         0.638 // 计算的值
	MassKg          4.56414441874044e+30 // log(g) = 3.974 cm/s^2
	RadSol          2.585 // Gaia DR3
	LumBol          122.194037153942 // 计算的值
	Teff            11936
	FeH             -1.434
}

// Object [BZR99] S Ori 68  ---  Brown Dwarf  ---  OID=@827928   (@@100460,3)  ---  coobox=6482 
// Object types: Brown Dwarf,Star,Young Stellar Object Candidate 
Remove "S Ori 68" {ParentBody "Mayrit 487350"}
Planet "[BZR99] S Ori 68/[BMZ2001] S Ori J053839.1-022805"
{
	DateUpdated     "2024-07-07"
	ParentBody      "[SE2004] 70"
	Class           "GasGiant"
	DiscMethod      "Imaging"
	DiscDate        "2019"
	MassJup         5

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1700
		Eccentricity    0.0651425876
		Inclination     0.823935473
		AscendingNode   160.599549
		ArgOfPericenter 309.442595
		MeanAnomaly     281.31758
	}
}