// Object * 20 Eri  ---  alpha2 CVn Variable  ---  OID=@666094   (@@14283,18)  ---  coobox=6334 
// Object types: Double or Multiple Star,alpha2 CVn Variable,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "20 Eri A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "20 Eri"
	Class           "B8III"
	AbsMagn         -0.123 // 计算的值
	MassKg          7.87996352670114e+30 // log(g) = 3.889 cm/s^2
	RadSol          3.745786 // Gaia DR3
	LumBol          324.108874728858 // 计算的值
	Teff            12654
	FeH             0.791

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.968849224
		Eccentricity    0.255674959
		Inclination     1.29228115
		AscendingNode   0
		ArgOfPericenter 91.8036028
		MeanAnomaly     -172.010149
	}
}

Star "20 Eri B"
{
	ParentBody      "20 Eri"
	Class           "F5.1?"
}

// Object * 15 Eri  ---  Double or Multiple Star  ---  OID=@635772   (@@13255,0)  ---  coobox=6693 
// Object types: Double or Multiple Star,Eclipsing Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "15 Eri A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "15 Eri"
	Class           "K0III"
	AbsMagn         0.85
	MassSol         2.32
	Radius          8016431.65585887 // 计算的值
	LumBol          72.4
	Teff            4960
	Age             1.44

	BinaryOrbit     
	{
		Period          118.16
		Separation      47.9971053355136 // 0.340 asec
		Eccentricity    0.030
		Inclination     66.6
		AscendingNode   271.6
		Epoch           2427526.206406261306256
		ArgOfPericenter 153.5
		MeanAnomaly     0
	}
}

Star "15 Eri B"
{
	ParentBody      "15 Eri"
	Class           "F3?"
}

// Object * alf For  ---  High Proper Motion Star  ---  OID=@5615812   (@@-1,255)  ---  coobox=6796 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoiLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=14879
Remove "Fornacis A" {ParentBody "Fornacis"}
Remove "Fornacis B" {ParentBody "Fornacis"}
Star "ALF For A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "ALF For"
	Class           "F6V"
	AbsMagn         3.08
	MassSol         1.33
	RadSol          2.04
	LumBol          4.87
	Teff            6240
	FeH             -0.20
	Age             2.9
}

// Object * alf For B  ---  High Proper Motion Star  ---  OID=@636697   (@@12399,0)  ---  coobox=6796 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Barycenter "ALF For B/GJ 127 B/Gaia DR3 5059349158319689344/ADS 2402 B/CCDM J03121-2859B/CD-29 1177B/CSI-29 1177 23/IDS 03078-2923 B/TYC 6445-990-2/WDS J03121-2859B/** HJ 3555B/HD 20010B/UCAC4 306-003184/Gaia DR2 5059348952156075392"
{
	ParentBody      "ALF For"
	BinaryOrbit // VB6_Sod1999 HJ_3555 Gr.4
	{
		Period          269
		Separation      55.9959798582214 // 4.0 asec
		Eccentricity    0.73
		Inclination     81
		AscendingNode   117
		Epoch           2432186.696862706914544
		ArgOfPericenter 43
		MeanAnomaly     0
	}
}

Star "ALF For Ba"
{
	DateUpdated     "2024-06-30"
	ParentBody      "ALF For B"
	Parallax        71.0089
	AppMagn         7.19
	Class           "G7V"
	AbsMagn         6.45  // 计算的值
	MassSol         0.79

	BinaryOrbit // 2016MNRAS.459.1682F
	{
		PeriodDays      3.75
	}
}

Star "ALF For Bb"
{
	DateUpdated     "2024-06-30"
	ParentBody      "ALF For B"
	Class           "WD"
	MassSol         0.5
}

// Object * sig Cet  ---  Double or Multiple Star  ---  OID=@1298958   (@@26657,0)  ---  coobox=11150 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=11783%20

// SIMBAD: B has 5 ref/K2.5V/no RV. PM difference of AB caused by Aab?
// A is evolved/above MS. B is on the MS.(A.sp.type = F4IV?)
// CHIRON 2014:RV(A,B)=-24.58,-28.26. 2017:RV(A,B)=-30.34,-28.20. 2020:RV(A)=-30.4
Barycenter "SIG Cet A"
{
	ParentBody      "SIG Cet"
	BinaryOrbit
	{
		Period          509484
		Separation      7939.58079701652 // 344.40 asec
	}
}

Star "SIG Cet Aa"
{
	DateUpdated     "2024-06-30"
	ParentBody      "SIG Cet A"
	Class           "F5V"
	AbsMagn         2.68
	MassSol         1.21
	RadSol          1.5
	LumBol          7.6
	Teff            6527
	FeH             -0.12
	Age             2.135

	BinaryOrbit
	{
		Period          20.3
		Epoch           2457238.6592771 // DR2: plx(A)=28.42mas/erroneous/Aa,Ab at periastron!
		Eccentricity    0.85
		Separation      8.2991807069898 // 0.360 asec
		AscendingNode   22
		ArgOfPericenter 21.6
		Inclination     120.5
		MeanAnomaly     0
	}
}

Star "SIG Cet Ab"
{
	DateUpdated     "2024-06-30"
	ParentBody      "SIG Cet A"
	Class           ""
	MassSol         0.69
}

// Object HD 15767  ---  High Proper Motion Star  ---  OID=@1298956   (@@26656,17)  ---  coobox=11148 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 15767/HIP 11759/Gaia DR3 5145956864601439488/TIC 66574369/2MASS J02314248-1516244/BD-15 447/GEN# +1.00015767/GSC 05860-01581/HIC 11759/PPM 211639/SAO 148443/TYC 5860-1581-1/UGP 37/YZ 105 661/** GWP 335B/WDS J02321-1515B/Gaia DR1 5145956860305611520/Gaia DR2 5145956864601439488"
{
	DateUpdated     "2024-06-30"
	ParentBody      "SIG Cet"
	Parallax        37.1885
	AppMagn         8.74
	Class           "K2.5Vk:"
	AbsMagn         6.59 // 计算的值
	MassSol         0.77
	Teff            4821
	FeH             -0.35
}


// Object * rho02 Eri  ---  Star  ---  OID=@624928   (@@15487,0)  ---  coobox=6186 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "RHO2 Eri A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "RHO2 Eri"
	Class           "K0III"
	AbsMagn         0.830
	MassSol         2.53
	RadSol          9
	LumBol          45.7
	Teff            4864
	FeH             0.19

	BinaryOrbit     
	{
		Separation      139.607454540713 // 1.8 asec
	}
}

Star "RHO2 Eri B"
{
	ParentBody      "RHO2 Eri"
	Class           "F9.4?"
}

// Object * 14 Eri  ---  Star  ---  OID=@634403   (@@15199,0)  ---  coobox=6276 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "14 Eri A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "14 Eri"
	Class           "F5VFe-0.7CH-0.5"
	AbsMagn         3.47
	MassSol         1.31
	RadSol          1.48
	LumBol          3.87
	Teff            6719
	FeH             -0.10
	Age             1.391

	BinaryOrbit // 计算的值
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0998793991
		Eccentricity    0.511101011
		Inclination     2.14650142
		AscendingNode   0
		ArgOfPericenter 16.2850565
		MeanAnomaly     61.663172
	}
}

Star "14 Eri B"
{
	ParentBody      "14 Eri"
	Class           "M0.7?"
}