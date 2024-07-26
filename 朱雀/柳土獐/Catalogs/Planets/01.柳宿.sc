// Object * kap Cnc  ---  alpha2 CVn Variable  ---  OID=@1604872   (@@33577,0)  ---  coobox=12835 
// Object types: alpha2 CVn Variable,Double or Multiple Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "KAP Cnc A" {ParentBody "KAP Cnc"}
Remove "KAP Cnc B" {ParentBody "KAP Cnc"}
Star "KAP Cnc A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "HIP 44798"
	Class           "B8IIImnp"
	AbsMagn         -0.82
	MassSol         4.5
	RadSol          5.0
	LumBol          322
	Teff            12800
	FeH             0.51

	BinaryOrbit     
	{
		PeriodDays      6.3933
		Eccentricity    0.13
		Epoch           2440001.95
		ArgOfPericenter 337
		MeanAnomaly     0
	}
}

Star "KAP Cnc B"
{
	DateUpdated     "2024-07-26"
	ParentBody      "HIP 44798"
	Class           ""
	MassSol         2.1
	RadSol          2.4
	LumBol          27.088930848749264 // 计算的值
	Teff            8500
}

// Object * alf Cnc  ---  High Proper Motion Star  ---  OID=@1131707   (@@19473,8)  ---  coobox=6005 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Acubens (AB)"{ParentBody "Acubens"}
Remove "ALF Cnc B"{ParentBody "Acubens"}
Remove "Acubens Aa"{ParentBody "Acubens (AB)"}
Remove "ALF Cnc Ab"{ParentBody "Acubens (AB)"}
Barycenter "ALF Cnc A"
{
	ParentBody      "ALF Cnc"
	BinaryOrbit     
	{
		Period          6568
		Separation      572.273393049769 // 10.49 asec
	}
}

Star "ALF Cnc Aa"
{
	DateUpdated     "2024-07-26"
	ParentBody      "ALF Cnc A"
	Class           "kA7VmF0/2III/IVSr"
	AbsMagn         0.46
	MassSol         2.10
	Radius          2611960.58514264 // 计算的值
	LumBol          50.55
	Teff            7943
	FeH             3.73

	BinaryOrbit     
	{
		Period          6.898
		Separation      5.45492005076337 // 0.1 asec
	}
}

Star "ALF Cnc Ab"
{
	ParentBody      "ALF Cnc A"
	Class           "A9?"
}

// Object 2MASS J08582877+1151360  ---  High Proper Motion Star  ---  OID=@1131708   (@@19473,9)  ---  coobox=6005 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "2MASS J08582877+1151360/Gaia DR3 604789261371774336/TIC 283785578/ADS 7115 B/CCDM J08585+1151B/CSI+12 1948 2/WDS J08585+1151B/** HJ 110B/PMSC 08530+1215B/Gaia DR2 604789261371774336"
{
	DateUpdated     "2024-07-26"
	ParentBody      "ALF Cnc"
	Class           "K7"
	MassSol         0.69
}

// Object * 21 Cnc  ---  Star  ---  OID=@1066337   (@@19049,20)  ---  coobox=5993 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Star "21 Cnc A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "21 Cnc"
	Class           "M2III"
	AbsMagn         -0.84 // 计算的值
	RadSol          53
	LumBol          587
	Teff            3885

	BinaryOrbit     
	{
		Separation      276.310053317386 // 1.14 asec
	}
}

Star "21 Cnc B"
{
	ParentBody      "21 Cnc"
	Class           "A6.5?"
}

// Object * bet Cnc  ---  High Proper Motion Star  ---  OID=@1066640   (@@18752,1)  ---  coobox=6080 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "Altarf A"{ParentBody "Altarf"}
Remove "Altarf B"{ParentBody "Altarf"}
Remove "BET Cnc A b"{ParentBody "BET Cnc A"}
Star "BET Cnc A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "BET Cnc"
	Class           "K4IIIBa0.5:"
	AbsMagn         -1.218
	MassSol         1.75
	RadSol          51.7
	LumBol          677
	Teff            4094
	FeH             -0.29
	Age             1.49

	BinaryOrbit     
	{
		Period          76000
		Separation      2600
	}
}

// Object UCAC4 496-050758  ---  High Proper Motion Star  ---  OID=@1066641   (@@18752,2)  ---  coobox=6080 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC4 496-050758/Gaia DR3 3098404216385467392/TIC 458582771/ADS 6704 B/CCDM J08165+0911B/CSI+09 1917 2/2MASS J08162909+0911203/WDS J08165+0911B/** BU 1065B/Gaia DR2 3098404216385467392"
{
	DateUpdated     "2024-07-26"
	ParentBody      "BET Cnc"
	Class           ""
	MassKg          1.24405720870201e+30 // log(g) = 4.669 cm/s^2
	RadSol          0.6063188 // Gaia DR3
	LumBol          0.100339734219753 // 计算的值
	Teff            4172
	FeH             -0.031
}

// Object * bet Cnc b  ---  Extra-solar Planet  ---  OID=@15302267   (@@-1,255)  ---  coobox=6080
// Object types: Extra-solar Planet,Star
Planet	"BET Cnc Ab"
{
	ParentBody     "BET Cnc A"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	Class          "GasGiant"
	MassJup        7.8
	Radius         80071.04

	Orbit
	{
		Epoch           2453229.8
		PeriodDays      605.2
		SemiMajorAxis   1.7
		Eccentricity    0.08
		ArgOfPericen    58.9
	}
}