// Object * 52 Peg A  ---  High Proper Motion Star  ---  OID=@11635369   (@@-1,255)  ---  coobox=9826 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "52 Peg A/ADS 16428 A/BD+10 4859A/CSI+10 4859 2/WDS J22592+1144A/TYC 1163-2022-1"
{
	DateUpdated     "2024-06-15"
	ParentBody      "52 Peg"
	Class           "A8V"

	BinaryOrbit     
	{
		Separation      43.3957271172442 // 0.46 asec
	}
}

// Object * 52 Peg B  ---  High Proper Motion Star  ---  OID=@11630395   (@@-1,255)  ---  coobox=9826 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "52 Peg B/ADS 16428 B/CSI+10 4859 3/IDS 22542+1112 B/WDS J22592+1144B/TYC 1163-2022-2"
{
	DateUpdated     "2024-06-15"
	ParentBody      "52 Peg"
	Class           "F6V"
}

// Object * rho Peg  ---  High Proper Motion Star  ---  OID=@1420381   (@@29541,2)  ---  coobox=9780 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "RHO Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "RHO Peg"
	Class           "A1V"
	AbsMagn         0.01
	MassSol         2.84
	RadSol          3.1
	LumBol          110
	Teff            9484
	Age             0.331

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.338146195
		Eccentricity    0.0088346466
		Inclination     2.02451909
		AscendingNode   0
		ArgOfPericenter -155.932264
		MeanAnomaly     143.195085
	}
}

Star "RHO Peg B"
{
	ParentBody      "RHO Peg"
	Class           "A7.8?"
}

// Object * 57 Peg  ---  S Star  ---  OID=@1420718   (@@29553,10)  ---  coobox=9790 
// Object types: S Star,Mira Variable,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Barycenter "57 Peg A"
{
	ParentBody      "57 Peg"
	BinaryOrbit     
	{
		Epoch           2457024
		Separation      7817.74582570734 // 32.6 asec
		PositionAngle   198
	}
}

Star "57 Peg Aa"
{
	DateUpdated     "2024-06-15"
	ParentBody      "57 Peg A"
	Class           "S4III" // S-type star, M4IIIa
	AbsMagn         -1.83
	MassSol         3 // 2
	RadSol          126
	LumBol          2697
	Teff            3707
	FeH             -0.99

	BinaryOrbit     
	{
		Period          100 // 500
	}
}

Star "57 Peg Ab"
{
	DateUpdated     "2024-06-15"
	ParentBody      "57 Peg A"
	Class           "A3V"
	MassSol         1.9
}

// Object BD+07 4981B  ---  Star  ---  OID=@1420719   (@@29553,11)  ---  coobox=9790 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+07 4981B/Gaia DR3 2713996092110598784/TIC 402902446/ADS 16550 B/AG+08 3195/CCDM J23095+0841B/CSI+07 4981 2/GSC 01161-01797/IDS 23045+0808 B/PPM 173802/SAO 128000/TYC 1161-1797-1/YZ 8 11542/2MASS J23093077+0840070/WDS J23095+0841B/Gaia DR2 2713996092110598784"
{
	DateUpdated     "2024-06-15"
	ParentBody      "57 Peg"
	Parallax        4.2265
	AppMagn         9.97
	Class           ""
	AbsMagn         3.1 // 计算的值
	MassKg          1.97128302022131e+30 // log(g) = 4.173 cm/s^2
	RadSol          1.351 // Gaia DR3
	LumBol          2.58382593853344 // 计算的值
	Teff            6296
	FeH             -0.415
}

// Object * 75 Peg  ---  Spectroscopic Binary  ---  OID=@1461080   (@@30446,0)  ---  coobox=9969 
// Object types: High Proper Motion Star,Eclipsing Binary,Eclipsing Binary,Spectroscopic Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=116611
Barycenter "75 Peg A"
{
	ParentBody      "75 Peg"
	BinaryOrbit     
	{
		Period          49720
		Separation      2049.30248984062 // 27.500 asec
	}
}

Barycenter "75 Peg Aa"
{
	ParentBody      "75 Peg A"
	BinaryOrbit     
	{
		Period          358.474
		Separation      70.7940879171221 // 0.950 asec
	}
}

Star "75 Peg Aa1"
{
	DateUpdated     "2024-06-15"
	ParentBody      "75 Peg Aa"
	Class           "A0Vn"
	AbsMagn         1.12 // 计算的值
	MassSol         2.29
	RadSol          2.192554 // Gaia DR3
	LumBol          34.52531668725 // 计算的值
	Teff            9449
	FeH             -1.197
	Oblateness      0

	BinaryOrbit     
	{
		PeriodDays      0.5021
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450735.641
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "75 Peg Aa2"
{
	DateUpdated     "2024-06-15"
	ParentBody      "75 Peg Aa"
	Class           ""
	MassSol         0.17
}

Star "75 Peg Ab"
{
	DateUpdated     "2024-06-15"
	ParentBody      "75 Peg A"
	Class           ""
	MassSol         0.30
}

Star "75 Peg B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "75 Peg"
	Class           "K5"
	MassSol         0.72
}