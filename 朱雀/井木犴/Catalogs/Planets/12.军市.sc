// Object * nu.01 CMa  ---  Star  ---  OID=@914319   (@@14739,5)  ---  coobox=7350 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "NU1 CMa A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "NU1 CMa"
	Class           "G8III"
	AbsMagn         1.23
	MassSol         1.41
	Radius          1767026.0771331 // 计算的值
	LumBol          8
	Teff            6091
	FeH             -0.06
	Age             3.07

	BinaryOrbit     
	{
		Separation      1504.44080352695 // 17.43 asec
	}
}

// Object BD-18 1478  ---  Star  ---  OID=@914318   (@@14739,4)  ---  coobox=7350 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD-18 1478/HIP 31560/Gaia DR3 2940433777347439232/TIC 48170828/2MASS J06362163-1839376/ADS 5253 B/CCDM J06364-1840B/GC 8613/GCRV 4270/GEN# +1.00047138B/GSC 05952-02801/HD 47138B/HIC 31560/IDS 06320-1835 B/PPM 217417/SAO 151693/SKY# 11489/TYC 5952-2801-1/YZ 108 2347/WDS J06364-1840B/** SHJ 73B/Gaia DR1 2940433773047522816/WEB 6317/Gaia DR2 2940433777347439232"
{
	DateUpdated     "2024-07-20"
	ParentBody      "NU1 CMa"
	Parallax        9.7456
	AppMagn         7.58
	Class           "F3IV-V"
	AbsMagn         2.52 // 计算的值
	MassKg          2.71429290619473e+30 // log(g) = 4.018 cm/s^2
	RadSol          1.895 // Gaia DR3
	LumBol          7.62246342250557 // 计算的值
	Teff            6967
	FeH             -0.815
}

// Object * ksi02 CMa  ---  Star  ---  OID=@915040   (@@14053,0)  ---  coobox=7700 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "KSI2 CMa A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "KSI2 CMa"
	Class           "A0III"
	AbsMagn         0.94
	RadSol          2.7
	LumBol          224
	Teff            8799
	Age             0.339

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   99.8336327
		Eccentricity    0.162782736
		Inclination     2.48223686
		AscendingNode   0
		ArgOfPericenter -13.7084619
		MeanAnomaly     3.11737061
	}
}

Star "KSI2 CMa B"
{
	ParentBody      "KSI2 CMa"
	Class           "B8.2?"
}

// Object * pi. CMa  ---  High Proper Motion Star  ---  OID=@930664   (@@14433,0)  ---  coobox=7401 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "PI CMa A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "PI CMa"
	Class           "F1.5V"
	AbsMagn         2.06
	MassSol         1.32
	Radius          1476278.92923275 // 计算的值
	LumBol          9
	Teff            6863
	FeH             -0.18
	Age             0.763

	BinaryOrbit     
	{
		Separation      339
	}
}

// Object * pi. CMa B  ---  High Proper Motion Star  ---  OID=@930817   (@@14440,27)  ---  coobox=7401 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "PI CMa B/Gaia DR3 2932346628813361408/TIC 79215531/ADS 5602 B/CCDM J06556-2008B/2MASS J06553761-2008000/WDS J06556-2008B/** H 123B/Gaia DR2 2932346628813361408/19 CMa B/HD 51199B"
{
	DateUpdated     "2024-07-20"
	ParentBody      "PI CMa"
	Parallax        33.6614
	AppMagn         9.6
	Class           ""
	AbsMagn         7.24 // 计算的值
	//MassKg           // log(g) = 4.61 cm/s^2
	Teff            4404
	FeH             0.218
}